def call(String solutionPath) {
    ContextRegistry.registerDefaultContext(this)

    def helloworld = new HelloWorld(solutionPath)
    helloworld.build()
}
