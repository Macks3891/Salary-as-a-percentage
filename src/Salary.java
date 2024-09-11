class SalaryIncrease {
    public static void main(String[] args) {
        // Текущие зарплаты сотрудников
        double dianaSalary = 66660;
        double andreySalary = 77770;
        double mariaSalary = 88880;

        // Процент повышения зарплаты
        double increasePercentage = 15.0;

        // Функция для расчета новой зарплаты и разницы в годовом доходе
        calculateAndPrintSalaryIncrease("Диана", dianaSalary, increasePercentage);
        calculateAndPrintSalaryIncrease("Андрей", andreySalary, increasePercentage);
        calculateAndPrintSalaryIncrease("Мария", mariaSalary, increasePercentage);
    }

    public static void calculateAndPrintSalaryIncrease(String name, double currentSalary, double increasePercentage) {
        // Расчет новой зарплаты
        double newSalary = currentSalary * (1 + increasePercentage / 100);

        // Расчет годового дохода до и после повышения
        double currentAnnualIncome = currentSalary * 12;
        double newAnnualIncome = newSalary * 12;

        // Расчет разницы в годовом доходе
        double incomeDifference = newAnnualIncome - currentAnnualIncome;

        // Вывод информации
        System.out.printf("%s теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.\n", name, newSalary, incomeDifference);
    }
}