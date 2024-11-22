#include <iostream>
#include <string>
#include <vector>
#include <fstream>
#include <signal.h>
#include <unistd.h>
#include <sys/wait.h>
#include <cstdlib> // для system()
#include <filesystem>


std::vector<std::string> history;
std::string history_filename = "command_history.txt";

void loadHistory() {
    std::ifstream file(history_filename);
    std::string line;
    while (std::getline(file, line)) {
        history.push_back(line);
    }
}

void saveHistory() {
    std::ofstream file(history_filename);
    for (const auto& command : history) {
        file << command << std::endl;
    }
}

void handle_sighup(int sig) {
    std::cout << "Configuration reloaded" << std::endl;
}

int main() {
    signal(SIGHUP, handle_sighup);
    loadHistory();

    std::string line;
    while (std::getline(std::cin, line)) {
        history.push_back(line);
        saveHistory();

        if (line == "exit" || line == "\\q") break;
        else if (line.substr(0, 5) == "echo ") {
            std::cout << line.substr(5) << std::endl;
        } else if (line.substr(0, 2) == "\\e") {
            std::string var_name = line.substr(2);
            char* var_value = getenv(var_name.c_str());
            if (var_value != nullptr)
                std::cout << var_value << std::endl;
            else
                std::cerr << "Переменная окружения не найдена." << std::endl;
        } else if (line.substr(0, 2) == "\\l") {
            // ОПАСНО!  system() выполняет произвольную команду
            int status = system(line.c_str()); // НЕБЕЗОПАСНО!
            if (status != 0){
              std::cerr << "Ошибка при выполнении команды" << std::endl;
            }
        } else if (line.substr(0, 5) == "\\cron"){
            // ОПАСНО! system() выполняет произвольную команду
            int status = system(line.c_str()); // НЕБЕЗОПАСНО!
            if (status != 0){
              std::cerr << "Ошибка при выполнении команды" << std::endl;
            }
        } else {
            // ОПАСНО!  system() выполняет произвольную команду
            int status = system(line.c_str()); // НЕБЕЗОПАСНО!
            if (status != 0){
              std::cerr << "Ошибка при выполнении команды" << std::endl;
            }
        }
    }

    return 0;
}
