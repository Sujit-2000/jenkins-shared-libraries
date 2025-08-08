def call(String branch, String repo, String githubCreds) {
    stage('Clone') {
        git branch: branch, credentialsId: githubCreds, url: repo
    }
}
