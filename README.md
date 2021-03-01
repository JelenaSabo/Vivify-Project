# Vivify-Project

1. For the manual testing part, I posted a PDF on the GitHub with answers to questions related to manual testing, as well as Bug report. Everything is in that one PDF.
Within "data" at automation part of testing, which I did in Excel, the first sheet (Edditing gallery) contains Test Cases for the manual part of gallery editing. 

2. For the automation testing part, I created a project called VivifyProject in Eclipse. Within it, I made two packages: pages and tests.
As part of the Pages packages, I created four classes (MainPage, LogInPage, CreateGalleryPage and MyGalleryPage, which was not completed, unfortunately, due to the inability to access the application). 
As part of the Tests package, I created four classes (TestBase, ExcelReader, LogInTests and CreateGalleryTests). 
- TestBase contains BeforeClass and AfterClass.
- ExcelReader contains data that I used for automatic log in and CreateGallery tests (second and third sheets in Excel, which is the same as for manual testing).
- LogInTests contains two tests: the first is for LogIn and the second is for LogOut.
- CreateGalleryTests contains one test that creates a gallery with data from Excel. 