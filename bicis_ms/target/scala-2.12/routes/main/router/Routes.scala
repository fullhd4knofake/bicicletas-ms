// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/felip/Documents/Arquitectura/Play/sa_bicis_ms/bicis_ms/conf/routes
// @DATE:Sun Mar 18 16:25:33 COT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  Assets_1: controllers.Assets,
  // @LINE:12
  BicisController_2: controllers.BicisController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    Assets_1: controllers.Assets,
    // @LINE:12
    BicisController_2: controllers.BicisController
  ) = this(errorHandler, HomeController_0, Assets_1, BicisController_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, BicisController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bicicletas""", """controllers.BicisController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bicicletas/create""", """controllers.BicisController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bicicletas/""" + "$" + """id<[^/]+>""", """controllers.BicisController.show(id:Integer)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bicicletas/edit/""" + "$" + """id<[^/]+>""", """controllers.BicisController.update(id:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bicicletas/delete/""" + "$" + """id<[^/]+>""", """controllers.BicisController.destroy(id:Integer)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BicisController_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bicicletas")))
  )
  private[this] lazy val controllers_BicisController_index2_invoker = createInvoker(
    BicisController_2.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BicisController",
      "index",
      Nil,
      "GET",
      this.prefix + """bicicletas""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_BicisController_create3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bicicletas/create")))
  )
  private[this] lazy val controllers_BicisController_create3_invoker = createInvoker(
    BicisController_2.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BicisController",
      "create",
      Nil,
      "POST",
      this.prefix + """bicicletas/create""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_BicisController_show4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bicicletas/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BicisController_show4_invoker = createInvoker(
    BicisController_2.show(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BicisController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """bicicletas/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_BicisController_update5_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bicicletas/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BicisController_update5_invoker = createInvoker(
    BicisController_2.update(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BicisController",
      "update",
      Seq(classOf[Integer]),
      "PATCH",
      this.prefix + """bicicletas/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_BicisController_destroy6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bicicletas/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BicisController_destroy6_invoker = createInvoker(
    BicisController_2.destroy(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BicisController",
      "destroy",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """bicicletas/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:12
    case controllers_BicisController_index2_route(params@_) =>
      call { 
        controllers_BicisController_index2_invoker.call(BicisController_2.index())
      }
  
    // @LINE:13
    case controllers_BicisController_create3_route(params@_) =>
      call { 
        controllers_BicisController_create3_invoker.call(BicisController_2.create())
      }
  
    // @LINE:14
    case controllers_BicisController_show4_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BicisController_show4_invoker.call(BicisController_2.show(id))
      }
  
    // @LINE:15
    case controllers_BicisController_update5_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BicisController_update5_invoker.call(BicisController_2.update(id))
      }
  
    // @LINE:16
    case controllers_BicisController_destroy6_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BicisController_destroy6_invoker.call(BicisController_2.destroy(id))
      }
  }
}
