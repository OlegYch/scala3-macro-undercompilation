import com.softwaremill.macwire.*

object Components extends App {
  try {
    val d = wire[Dep]
    val d1 = wire[Dep1]
    val d2 = wire[Dep2]
  } catch {
    case e =>
      e.printStackTrace()
      sys.exit(-1)
  }
}