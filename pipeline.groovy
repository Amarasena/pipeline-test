pipeline {
    agent any
    stages {
        stage('Run Python Script') {
            steps {
                script {
                    // Check if Python 3 is installed, if not, install it
                    bat 'python --version'  // Check Python version

                    // Run your Python script
                    bat 'python print_code.py'
                }
            }
        }
    }
}
