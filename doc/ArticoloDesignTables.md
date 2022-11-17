|Design Document: The Articolo Class|
| Method | Visibility | Purpose |
|----------|:-------------:|------:|
| Articolo | public | Default constructor |
| Articolo | public | Parametrized constructor |
| Articolo | public | Copy constructor |
| setDescrizione | public | Set the class var "descrizione" |
| setPrezzo | public | Set the class var "prezzo" |
| getDescrizione | public | Get the class var "descrizione" |
| getPrezzo | public | Get the class var "prezzo" |
| getCodA | public | Get the class var "codA" |
| toString | public | Return a representative string of the object |
| equals | public | Return "true" if the object are equals |

|Design Document: The Vendita Class|
| Method | Visibility | Purpose |
|----------|:-------------:|------:|
| Vendita | public | Class constructor |
| start | public | Run all the private methods and start activities |
| describeProgram | private | Display the program description |
| getInput | private | Get input from user and set Articolo's instance variable |
| computing | private | Display a string |
| displayOutput | private | Display the Articolo's method toString() |

|Design Document: The ControlVendita Class|
| Method | Visibility | Purpose |
|----------|:-------------:|------:|
| main | public | Create a Vendita type object  and run the start method |
