class HelloWorld implements Serializable {
    private String _solutionPath

    HelloWorld(String solutionPath) {
        _solutionPath = solutionPath
    }

    void build() {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        int returnStatus = steps.sh("${this._solutionPath}")
        if (returnStatus != 0) {
            steps.error("Unable To Execute The Command")
        }
    }
}
