load("@rules_java//java:defs.bzl", "java_binary","java_library",)

java_binary(
    name = "hello_world",
    srcs = ["HelloWorld.java"],
    main_class = "main.java.com.algo.project.HelloWorld",
    deps= [
        ":util_lib"
    ],
)  

java_library(
    name="util_lib",
    srcs=glob(["utils/*.java"]),
    visibility=["//visibility:public"],
)

