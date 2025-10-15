package org.example

class Utilities implements Serializable {
    def steps

    Utilities(steps) { this.steps = steps }

    def buildApp() {
        steps.echo "Building the application..."
        steps.sh 'mvn clean package'
    }

    def deployApp() {
        steps.echo "Deploying the application..."
        steps.sh 'kubectl apply -f deployment.yaml'
    }
}
