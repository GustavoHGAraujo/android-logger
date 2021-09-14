# Logger

Add multiple targets to log on without having to visit all code.

![demonstration](https://user-images.githubusercontent.com/18123187/133332566-2b5fa990-d759-44e5-8eb3-d61b9f7fdb61.gif)

## How to use

Add the wanted log function where you want. By default the log functions will automatically log using `android.util.Log`.

```kotlin
class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.buttonLogDebug.setOnClickListener {
      logd("Testing")
    }
    binding.buttonLogDebugLocally.setOnClickListener {
      logd("Testing (log locally)", locallyOnly = true)
    }
  }
}
```

### Customizing a logger

To add another log receiver, you can implement either `Logger.Local` or `Logger.Remote`.
After creating the custom logger instance, simply register it using `registerLogger(loggerInstance)`.

To unregister a logger, call `unregisterLogger(logerInstance)`.

```kotlin
class ToastLogger(private val context: Context): Logger.Local {

  private fun toast(msg: String) = Toast
    .makeText(context, msg, Toast.LENGTH_SHORT)
    .show()

  override fun log(level: Logger.Level, tag: String, message: String) {
    toast("[$level] [$tag] $message")
  }

  override fun log(level: Logger.Level, tag: String, throwable: Throwable) {
    toast("[$level] [$tag] ${throwable.message}")
  }

  override fun log(level: Logger.Level, tag: String, message: String, throwable: Throwable) {
    toast("[$level] [$tag] $message | Error: ${throwable.message}")
  }
}
  
class MyApplication : Application() {
  fun onCreate() {
    super.onCreate()
    
    val toastLogger = ToastLogger(this)
    registerLogger(toastLogger)
  }
}
```
