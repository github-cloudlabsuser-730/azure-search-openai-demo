Determining workspace structure

Deciding which workspace information to collect

Gathering workspace info

# Backend Application Documentation

The backend application is located in the [`app/backend`](app/backend) directory. It is built using [Quart](https://quart.palletsprojects.com/), a Python framework for asynchronous web applications.

## Directory Structure

- [`app/backend/approaches`](command:_github.copilot.openRelativePath?%5B%22app%2Fbackend%2Fapproaches%22%5D "app/backend/approaches"): This directory contains the classes powering the Chat and Ask tabs. Each class uses a different RAG (Retrieval Augmented Generation) approach. The primary backend code you'll want to customize is located here.

- [`app/backend/main.py`](command:_github.copilot.openRelativePath?%5B%22app%2Fbackend%2Fmain.py%22%5D "app/backend/main.py"): This is the main entry point for the backend application.

## Key Files

- [`chatreadretrieveread.py`](command:_github.copilot.openSymbolInFile?%5B%22app%2Fbackend%2Fapproaches%2Fchatreadretrieveread.py%22%2C%22chatreadretrieveread.py%22%5D "app/backend/approaches/chatreadretrieveread.py"): This file contains the approach used in the chat tab. It calls the OpenAI ChatCompletion API to turn the user question into a good search query, queries Azure AI Search for search results for that query, and then combines the search results and original user question to answer the question based on the sources.

## Running the Backend

To start the backend, navigate to the [`app/backend`](command:_github.copilot.openRelativePath?%5B%22app%2Fbackend%22%5D "app/backend") directory and run the following command:

```sh
../../.venv/bin/python -m quart --app main:app run --port 50505 --host localhost --reload
```

This command starts the Quart application with the `main:app` module, listening on `localhost:50505`, and enables hot reloading.

## Customizing the Backend

The `system_message_chat_conversation` variable in [`chatreadretrieveread.py`](command:_github.copilot.openSymbolInFile?%5B%22app%2Fbackend%2Fapproaches%2Fchatreadretrieveread.py%22%2C%22chatreadretrieveread.py%22%5D "app/backend/approaches/chatreadretrieveread.py") is currently tailored to the sample data. Change that to match your data.

## Dependencies

The backend application's dependencies are listed in the [`app/backend/requirements.txt`](command:_github.copilot.openRelativePath?%5B%22app%2Fbackend%2Frequirements.txt%22%5D "app/backend/requirements.txt") file. To install these dependencies, run the following command:

```sh
./.venv/bin/python -m pip install -r app/backend/requirements.txt
```

This command installs the required Python packages into the virtual environment.

## Communication

The frontend and backend communicate using the [AI Chat App HTTP Protocol](https://github.com/Azure-Samples/ai-chat-app-protocol).