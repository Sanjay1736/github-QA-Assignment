# GitHub QA Assignment – UI & API Test Automation

## 📌 Overview
This project is a QA automation framework designed to test GitHub's web UI and REST API functionalities.

**Tools & Technologies:**
- Java
- Selenium WebDriver
- TestNG
- Rest Assured
- Maven
- GitHub Actions (CI/CD)

---

## 📁 Project Structure
src/
├── test/
│ └── java/
│ ├── ui/ # Selenium UI tests
│ └── api/ # RestAssured API tests
.github/
└── workflows/
└── ci.yml # GitHub Actions pipeline
Manual_Test_Cases.md # Manual test cases
Test_Results/ # HTML test reports
pom.xml # Maven config
README.md # This file

yaml
Copy
Edit

---

## ⚙️ Setup Instructions

### ✅ Prerequisites
- JDK 11+
- Maven
- GitHub Personal Access Token (for API tests)

### 🔧 Clone the Repository

```bash
git clone https://github.com/Sanjay1736/github-QA-Assignment.git
cd github-QA-Assignment

Reports
After test execution, reports are generated in:

bash
Copy
Edit
Test_Results/
└── test-output/index.html


Sanjay Gudipudi
QA Engineer | Automation Enthusiast

yaml
Copy
Edit

---

## ✅ 2. `Manual_Test_Cases.md` (Manual Scenarios)

```markdown
# Manual Test Cases – GitHub QA Assignment

---

## ✅ Login Functionality

| Step | Action                     | Input            | Expected Result                |
|------|----------------------------|------------------|--------------------------------|
| 1    | Navigate to GitHub login   | -                | Login page opens               |
| 2    | Enter valid credentials    | username/password| Redirect to dashboard          |
| 3    | Leave fields blank         | -                | "Field required" message       |
| 4    | Enter invalid credentials  | random data      | Error message is shown         |

---

## ✅ Repository Creation

| Step | Action                    | Input             | Expected Result               |
|------|---------------------------|-------------------|-------------------------------|
| 1    | Click "New Repository"    | -                 | Repository form appears       |
| 2    | Enter valid name          | "TestRepo"        | Repo created under account    |
| 3    | Leave name blank          | -                 | Error message is shown        |
| 4    | Choose visibility         | Public/Private    | Repo reflects correct setting |

---

## ✅ Issue Tracking

| Step | Action                | Input         | Expected Result               |
|------|-----------------------|---------------|-------------------------------|
| 1    | Go to Issues tab      | -             | Issues page opens             |
| 2    | Click "New Issue"     | Title/Desc    | Issue is listed               |
| 3    | Assign labels         | Bug/Feature   | Labels appear on issue        |

---

## ✅ Pull Requests

| Step | Action                | Input          | Expected Result             |
|------|-----------------------|----------------|-----------------------------|
| 1    | Create new PR         | Compare branches| PR created                  |
| 2    | Add comment/reviewer  | Reviewer name  | Reviewer is notified        |
| 3    | Merge PR              | -              | Code is merged              |
