<h1 style="text-align: center;">OMS Store</h1>

## Objetivo del Proyecto
El objetivo del proyecto OMS Store es desarrollar una suite de generación de insumos con un proceso automatizado para la aplicación OMS Store. Esta suite utiliza Selenium y Cucumber para automatizar la interacción con la aplicación web.  

---

## Solución
La solución implementada en este proyecto incluye:  
- **``Automatización de insumos``**: Utiliza Selenium para la automatización del navegador y Cucumber para la ejecución basadas en BDD (Behavior Driven Development).  
- **``Gestión de Configuraciones``**: Las configuraciones necesarias para la generación de insumos, como URLs y credenciales, se gestionan a través de un archivo de propiedades (input.properties).  

---

## Estructura del Proyecto:  
- **``Clases de Página``**: Representan las diferentes páginas de la aplicación y encapsulan la lógica de interacción con los elementos de la página.
- **``Definiciones de Pasos``**: Contienen las implementaciones de los pasos de Cucumber que describen las acciones a realizar en las pruebas.
- **``Ejecución``**: Los scripts se ejecutan utilizando Maven, lo que permite una integración continua y fácil ejecución.  
- **``Generación de Reportes``**: Utiliza Allure para la generación de reportes detallados de las pruebas, facilitando el análisis de los resultados.  
- **``Gestión de Drivers``**: WebDriverManager se utiliza para la gestión automática de los drivers de los navegadores, simplificando la configuración del entorno de pruebas

---

## Índice
1. [Requisitos](#requisitos)
2. [Instalación](#instalación)
3. [Estructura del Proyecto](#estructura-del-proyecto)
4. [Ejecución de Pruebas](#ejecución-de-pruebas)
5. [Configuración](#configuración)
6. [Dependencias](#dependencias)
7. [Diagrama de Secuencia](#diagrama-de-secuencia)
8. [Desarrollador](#desarrollador)

---

## Requisitos

- Java 11
- Maven 3.6.3 o superior

---

## Instalación

1. Clona el repositorio:
    ```sh
    git clone https://github.com/tu-usuario/oms-store.git
    ```
2. Navega al directorio del proyecto:
    ```sh
    cd oms-store
    ```
3. Instala las dependencias del proyecto:
    ```sh
    mvn clean install
    ```

---

## Estructura del Proyecto

- `src/test/resources/input.properties`: Archivo de propiedades que contiene las configuraciones necesarias para las pruebas.
- `src/test/java/page/`: Contiene las clases de página que representan las diferentes páginas de la aplicación.
- `src/test/java/steps/`: Contiene las definiciones de los pasos de Cucumber.

---

## Ejecución de Pruebas

Para ejecutar las pruebas, utiliza el siguiente comando:

   ```
   mvn test
   ```

---

## Configuración
Asegúrate de que el archivo src/test/resources/input.properties esté configurado correctamente con las URL y credenciales necesarias:

```
web.url.sterling=https://omsperf-sl.liverpool.com.mx/sbc/sbc/login.do?showSurvey=Y&scFlag=Y
web.sterling.user=tu-usuario
web.sterling.pass=tu-contraseña
```

----

## Dependencias
El proyecto utiliza las siguientes dependencias:  

- Cucumber: Para la ejecución de pruebas BDD.
- Selenium: Para la automatización del navegador.
- WebDriverManager: Para la gestión de los drivers de los navegadores.
- Allure: Para la generación de reportes de pruebas.
- JUnit: Para la ejecución de pruebas unitarias.

----

## Diagrama de secuencia
```
    participant UserSteps
    participant BasePage
    participant TestRunner
    participant WebDriver
    participant SessionPage
    participant LogicSessionPage
    participant WorkFlowPage

    UserSteps->>LogicSessionPage: navigateToBusinessCenter()
    LogicSessionPage->>BasePage: navigateTo(url)
    BasePage->>WebDriver: get(url)

    UserSteps->>SessionPage: insertUserName()
    UserSteps->>SessionPage: insertPassword()
    UserSteps->>SessionPage: selectButton()

    UserSteps->>SessionPage: selectCloseButton()

    TestRunner->>SessionPage: closeBrowser()
    SessionPage->>WebDriver: quit()

    WorkFlowPage->>LogicOrganizationPage: insertHubOrganizationAndSelect()
    WorkFlowPage->>LogicOrganizationPage: clickInventoryOption()
    WorkFlowPage->>LogicOrganizationPage: clickNodeCapacityOption()
    WorkFlowPage->>LogicOrganizationPage: clickResourcePool()
    WorkFlowPage->>LogicOrganizationPage: clickButtonAdd()
    WorkFlowPage->>LogicOrganizationPage: insertEffectiveStartDate()
    WorkFlowPage->>LogicOrganizationPage: insertEffectiveEndDate()
    WorkFlowPage->>LogicOrganizationPage: clickButtonSave()
    WorkFlowPage->>LogicOrganizationPage: checkStandardCapacityPeriod()
    WorkFlowPage->>LogicOrganizationPage: insertSundayCapacity()
    WorkFlowPage->>LogicOrganizationPage: insertMondayCapacity()
    WorkFlowPage->>LogicOrganizationPage: insertTuesdayCapacity()
    WorkFlowPage->>LogicOrganizationPage: insertWednesdayCapacity()
    WorkFlowPage->>LogicOrganizationPage: insertThursdayCapacity()
    WorkFlowPage->>LogicOrganizationPage: insertFridayCapacity()
    WorkFlowPage->>LogicOrganizationPage: insertSaturdayCapacity()
    WorkFlowPage->>LogicOrganizationPage: clickButtonSaveCapacity()
```

----

## Estrucutra del Proyecto
```
oms-store/
├── src/
|   ├── main/
│   │   ├── java/
│   │   │   ├── inputData/
│   │   │   │   ├── BrowserData.java
│   │   │   ├── messages_console/
│   │   │   │   ├── MessagesConsole.java
│   │   │   ├── print_messages/
|   |   |   |   ├── Messages.java
│   │   │   ├── settings_browser/
│   │   │   │   ├── ViewSettings.java
│   ├── test/
│   │   ├── java/
|   |   |   ├── conts/
│   │   │   │   ├── PropertyConst.java
│   │   │   ├── page/
│   │   │   │   ├── BasePage.java
│   │   │   │   ├── LogicOrganizationPage.java
│   │   │   │   ├── LogicSessionPage.java
│   │   │   │   ├── SessionPage.java
│   │   │   │   ├── WorkFlowPage.java
│   │   │   ├── steps/
│   │   │   │   ├── UserSteps.java
|   |   |   |   ├── WorkFlowCenterStep.java
│   │   │   ├── utils/
|   |   |   |   ├── BrowserUtils.java
│   │   │   │   ├── PropertyReader.java
|   |   |   |   ├── TimeSleepWait.java
│   │   │   ├── runner/
│   │   │   │   ├── TestRunner.java
│   ├── resources/
│   │   ├── features/
│   │   │   ├── sterling.feature
│   │   ├── input.properties
├── pom.xml
└── README.md
```

---

## Desarrollador
```
Nombre: Eduardo Avila Carranza
Email: eavila@liverpool.com.mx
Rol: Software Development Engineer in Test - SDET
```
