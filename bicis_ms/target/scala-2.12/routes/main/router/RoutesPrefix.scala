// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/felip/Documents/Arquitectura/Play/sa_bicis_ms/bicis_ms/conf/routes
// @DATE:Sun Mar 18 16:25:33 COT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
