# battlecode2015
1.    Clone the repo
2.    Open eclipse
3.    Go to File > Import
4.    In the import window, go to General > Existing Projects into Workspace and click Next
5.    In "Select root directory", select the directory where you cloned battlecode
6.    Click Finish
7.    Select the "battlecode2015" project in the Project Explorer and click "Debug"
8.    If it asks you to choose a class with a main method, you want the battlecode client

Note: If you are unable to find the Main - battlecode.client then you need to update the buildpath. To do this:

1. Right click on Project
2. Select "Build Path"
3. Select "Configure Build Path"
4. Select "Libraries Tab"
5. For each of the 4 .jar files (client, server, player and jogl.all)
  1. Select the jar
  2. Click "Edit"
  3. Navigate to the jar ({LocalRepoPath}/libs)
  4. Select the Jar and click "Open"
6. Click OK
7. Attmept steps 7 & 8 from the first portion of this readme


Details for mechanics can be found at: https://github.com/battlecode/battlecode-server/blob/2015-1.0.3/specs.md
