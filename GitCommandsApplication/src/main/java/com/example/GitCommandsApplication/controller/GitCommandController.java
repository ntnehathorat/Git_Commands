package com.example.GitCommandsApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/git")
public class GitCommandController {

    @GetMapping("/devops")
    public String getDevOpsInfo() {
        return "DevOps is a set of practices that combines software development (Dev) and IT operations (Ops), aiming to shorten the development lifecycle and provide continuous delivery with high software quality.";
    }

    @GetMapping("/cloud-computing")
    public String getCloudComputingInfo() {
        return "Cloud computing is the delivery of computing services such as servers, storage, databases, networking, software, over the cloud (internet). Popular cloud platforms include Amazon Web Services (AWS), Microsoft Azure, Google Cloud, and IBM Cloud.";
    }

    @GetMapping("/ci-cd")
    public String getCICDInfo() {
        return "CI/CD stands for Continuous Integration and Continuous Delivery. It is a method to frequently deliver applications to customers by introducing automation into the stages of app development. CI automates the integration of code changes from multiple contributors, while CD automates the deployment process.";
    }

    @GetMapping("/devops-benefits")
    public String getDevOpsBenefits() {
        return "Benefits of DevOps include faster delivery of features, improved collaboration and communication between teams, enhanced security, and more reliable releases.";
    }

    @GetMapping("/git")
    public String getGitInfo() {
        return "Git is a distributed version control system used to track changes in source code during software development.";
    }

    @GetMapping("/git-features")
    public String getGitFeatures() {
        return "Key features of Git include: distributed version control, branching and merging, fast performance, and ability to work offline.";
    }

    @GetMapping("/git-vs-svn")
    public String getGitVsSVNInfo() {
        return "Git is a distributed version control system, whereas SVN (Subversion) is a centralized version control system. Git allows each user to have their own copy of the repository, whereas SVN relies on a central repository.";
    }

    @GetMapping("/git-vs-github")
    public String getGitVsGitHubInfo() {
        return "Git is a version control system used to manage source code, while GitHub is a platform for hosting Git repositories and collaboration between developers.";
    }

    @GetMapping("/git-commands")
    public String getGitCommandsInfo() {
        return "Some basic Git commands: \n- 'git init': Initializes a new Git repository. \n- 'git add': Adds files to the staging area. \n- 'git commit': Records changes in the repository. \n- 'git push': Pushes changes to a remote repository. \n- 'git pull': Fetches changes from a remote repository.";
    }

    @GetMapping("/git-status")
    public String getGitStatusInfo() {
        return "'git status' is used to display the state of the working directory and the staging area. It shows which files are staged, unstaged, and untracked.";
    }

    @GetMapping("/clone")
    public String getGitCloneInfo() {
        return "'git clone' creates a copy of an existing repository.";
    }

    @GetMapping("/push")
    public String getGitPushInfo() {
        return "'git push' uploads local repository content to a remote repository.";
    }

    @GetMapping("/pull")
    public String getGitPullInfo() {
        return "'git pull' fetches and integrates changes from a remote repository.";
    }


    //tocken saved in credetial manager in our system

    // setting -> developer setting -> personal tocken -> classic tocken

    // git checkout
    // git merge branch name
    // git push origin
}
