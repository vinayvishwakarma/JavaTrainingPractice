## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


## File Sharing With CRIMARR

Below are the steps for file sharing mechanism with CRIMARR team:

1) Open Return List Page and click on download the file
2) Login to PIMS and take remote access of server
3) Go to loction /data/scripts and run the script FRT.sh via command sh FRT.sh
4) If script output is successful task completed
5) Else go to location /data/returnfiles/sent and check which is the latest folder created (U can use the command ls - ltr)
6) go to the folder which have latst files.
7) Connect to SFG and send the files:
    a) Login to SFG with a sftp command
    b) copy the files in the folder to sfg via put command (put .)


