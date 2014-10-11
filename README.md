# Play Multi-Project

An example of building applications that consist of multiple services.

First off, the top-level project is an sbt multi-project. It defines two Play applications, `app1` and `app2`. It also
defines a non-Play project `model` that contains code shared by the Play applications.

Each Play app is then split into a master app, and Play sub-modules (in this case only an admin module). Play sub-modules
follow Play conventions, but require to use a separate routes file and sub-package for controllers and views. They
cannot have conf files.

Note how sbt plugins are only defined by the root build.

## Running

You can run each app individually by using `sbt ";project app<n>;run`. Two scripts are provided for this.

## Testing

`sbt test` will run all tests in all sub-projects.
