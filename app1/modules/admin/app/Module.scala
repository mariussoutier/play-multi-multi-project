import actor.DummyActor
import play.api.{Configuration, Environment}
import play.api.inject.Binding
import play.api.libs.concurrent.Akka

class Module extends play.api.inject.Module {
  override def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] = Seq(
    Akka.bindingOf[DummyActor]("dummy-actor", _ => DummyActor.props)
  )
}
