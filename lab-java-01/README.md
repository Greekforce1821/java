### Εργαστήριο #1 - Εισαγωγή στη Java, τη JVM και το JDK
___
Σκοπός του πρώτου εργαστηρίου είναι να εξοικειωθείτε με τη Java VM, το Java Development Kit στο περιβάλλον επεξεργασίας πηγαίου κώδικα IDE Atom ή στο GoormIDE.

___
#### Προετοιμασία (_πριν το εργαστήριο_) ####

* **[Desktop: Linux/Mac/Windows]** Βεβαιωθείτε ότι στην **επιφάνεια εργασίας** που εργάζεστε είναι εγκατεστημένα και ρυθμισμένα τα ακόλουθα:
    * **Java Virtual Machine & Development Kit**
      * εκτελέστε σε ένα τερματικό την εντολή `java -version`, αν λάβετε απάντηση με ένα αριθμό έκδοσης, τότε η **JVM** είναι εγκατεστημένη
      * εκτελέστε σε ένα τερματικό την εντολή `javac -version`, αν λάβετε απάντηση με ένα αριθμό έκδοσης, τότε το **JDK** (compiler και άλλα εργαλεία) είναι εγκατεστημένο
      * **αν δεν είναι** εγκατεστημένο κάτι από τα δύο (ή είναι σε παλαιότερη έκδοση) κάντε λήψη και εγκατάσταση από: https://adoptopenjdk.net/

    * **Pulsar IDE + packages** (λήψη από: https://pulsar-edit.dev)
      * βεβαιωθείτε ότι είναι εγκατεστημένο το Atom IDE
      * ελέγξτε (από το μενού `Packages > Settings View > Install Packages/Themes`) ότι έχουν εγκατασταθεί τα :
        - script
        - tool-bar
        - tool-bar-atom
        - terminus
        - basic-java-compile
        - autocomplete-java
        - linter-java και dependencies

* **[Cloud]** _Εναλλακτικά_ για το cloud based IDE GoormIDE βεβαιωθείτε ότι έχετε δημιουργήσει ένα java based container, ακολουθώντας τις οδηγίες στις διαφάνειες της πρώτης διάλεξης.
    * Ελέξτε όπως πιο πάνω την ύπαρξης **σωστής έκδοσης** **JVM** και **JDK**.

___
#### Μελέτη (_πριν έρθετε στο εργαστήριο_): ####
* Μελετήστε και εκτελέστε τα παραδείγματα του:  
  https://www.freecodecamp.org/news/command-line-for-beginners/  
  - Σε περιβάλλον linux ή mac εκτελούνται στο terminal
  - Στο cloud IDE goorm εκτελούνται στο παρεχόμενο terminal εντός του browser
  - Σε περιβάλλον win εκτελούνται σε περιβάλλον WLS (Windows Linux Subsystem)
* 😱 Help needed? https://github.com/riggas-ionio/java/discussions
