public class Main {

    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        Task bayCar = new Task("Приехать в салон", "Купить машину");
        Task bayCars = taskManager.addTask(bayCar);
        System.out.println(bayCars);

        Task bayCarToUpdate = new Task(bayCars.getId(), "Не забыть для начала проверить отчет",
                "Можно без него",
                Status.IN_PROGRESS);
        Task bayCarUpdate = taskManager.updateTask(bayCarToUpdate);
        System.out.println(bayCarUpdate);


        Epic makeTask = new Epic("Сделать домашнее задание", "Нужно во время перемены");
        taskManager.addEpic(makeTask);
        System.out.println(makeTask);
        Subtask makeTask1 = new Subtask("Дописать 2 параграфа", "Обязательно тезисы!",
                makeTask.getId());
        Subtask makeTask2 = new Subtask("Завести новую тетрадь",
                "Старую просто носить с собой",
                makeTask.getId());
        taskManager.addSubtask(makeTask1);
        taskManager.addSubtask(makeTask2);
        System.out.println(makeTask);
        makeTask2.setStatus(Status.DONE);
        taskManager.updateSubtask(makeTask2);
        System.out.println(makeTask);
    }
}