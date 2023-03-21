# Kotlin-MVC

> Tips：Arrows can be understood as references, dependencies, or calls, because references must be called.
>
> Some MVC pattern diagrams contain dotted lines and solid lines: dotted lines generally represent temporary variables and parameter callbacks, and solid lines represent member variables.

1. Model：The data model is responsible for data acquisition and modification. The code is represented as Model, Repository (isolate data), Service (access network), Dao (access database), Entity, etc.
2. View：View, responsible for view display and view control. The code is expressed as Layout+Activity, such as findViewById, setText, animation, etc.
3. Controller：Controller, responsible for all behavioral logic. The code is expressed as Activity+ various management classes, such as network requests, SP storage, database access, power information, network status, etc. In addition to the call to the Model, it also includes some logic processing, such as valid verification and encryption of the account password before calling the login interface.
