# AI-Powered-DevScope-Code-Execution-Intelligent-Evaluation-Platform
A Spring Boot-based web application that allows users to upload Java code, execute it on the server, and receive AI-powered feedback and score

# 🚀 DevScope AI – Code Execution & AI Evaluation Platform

DevScope AI is a full-stack web application that allows users to:

- 📂 Upload Java files
- ▶ Execute code on the server
- 🤖 Get AI-powered code analysis
- 📊 Receive scores and feedback

---

## 🔥 Features

- Upload `.java` file and run code
- Display real-time output
- AI-based code evaluation (score + feedback)
- REST API integration
- Clean and simple UI
- MySQL database integration

---

## 🛠️ Tech Stack

### Backend:
- Java
- Spring Boot
- Spring Data JPA
- Spring Security (basic config)
- WebClient (API calls)

### Frontend:
- HTML
- CSS
- JavaScript (Fetch API)

### Database:
- MySQL

### AI Integration:
- OpenAI API

---

## ⚙️ How It Works

1. User uploads Java file
2. Backend:
   - Saves file
   - Compiles using `javac`
   - Executes using `java`
3. Output is returned to UI
4. AI analyzes code and returns:
   - Score
   - Issues
   - Improvements

---

## 📁 Project Structure
