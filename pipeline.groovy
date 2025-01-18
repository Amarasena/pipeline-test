pipeline {
    agent any
    stages {
        stage('Run Python Script') {
            steps {
                // Execute the Python script
                sh 'python3 print_code.py'
            }
        }
    }
}

