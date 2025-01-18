node {
    stage('Run Python Script') {
        sh 'python3 print_code.py'
    }
}
