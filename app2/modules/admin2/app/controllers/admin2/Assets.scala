package controllers.admin2

import javax.inject._

import controllers.AssetsBuilder
import play.api.http.HttpErrorHandler

// Without this we get
// [RuntimeException: java.lang.NoSuchMethodError: controllers.ReverseAssets.versioned(Ljava/lang/String;)Lplay/api/mvc/Call;]
// when accessing /admin/index
@Singleton
class Assets @Inject() (errorHandler: HttpErrorHandler) extends AssetsBuilder(errorHandler)
