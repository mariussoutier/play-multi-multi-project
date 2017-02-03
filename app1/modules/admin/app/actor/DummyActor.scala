package actor

import akka.actor.{Props, Actor, ActorLogging}

class DummyActor extends Actor with ActorLogging {

  import DummyActor._

  override def receive: Receive = {
    case 'ping =>
      log.info("message received")
      sender ! 'pong
  }

}

object DummyActor {

  def props: Props = Props(new DummyActor)

}
