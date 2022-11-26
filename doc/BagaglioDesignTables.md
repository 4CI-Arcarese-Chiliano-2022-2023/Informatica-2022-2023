|Design Document: The Bagaglio Class|
| Method | Visibility | Purpose |
|----------|:-------------:|------:|
| Bagaglio() | public | Default constructor |
| Bagaglio() | public | Parametrized constructor |
| Bagaglio() | public | Copy constructor |
| setWeight() | public | Set the class var "weight" |
| getWeight() | public | get the class var "weight" |
| getMaxWeight() | public | Get the class var "MAX_WEIGHT" |
| sovrapprezzo() | public | Return true if this.weight > MAX_WEIGHT |
| toString() | public | Return a representative string of the object |

|Design Document: The BagaglioView Class|
| Method | Visibility | Purpose |
|----------|:-------------:|------:|
| BagaglioView | public | Class constructor |
| start() | public | Run all the private methods and start activities |
| descriviAttivita() | private | Display the program description |
| prendiInput() | private | Get input from user and set model's instance variable |
| calcolaPrezzo() | private | Compute and returns the cost of "bag" (Bagaglio)  |
| visualizzaRisultati() | private | Display process results |

|Design Document: The ControlVendita Class|
| Method | Visibility | Purpose |
|----------|:-------------:|------:|
| main | public | Create a Bagaglio type object and run the start() method |
