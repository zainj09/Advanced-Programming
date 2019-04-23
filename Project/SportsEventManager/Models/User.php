<?php 
  class User {
    // DB stuff
    private $conn;
    private $table = 'user';
    // Post Properties
    public $userName;
    public $fullName;
    public $email;
    public $password;
    public $about;
    public $forgetPasswordQA;

    // Constructor with DB
    public function __construct($db) {
      $this->conn = $db;
    }


    // join Club    
    public function join_club($clubName) {
    //   // Create query
    //   $query='SELECT * FROM ' . $this->table . 'WHERE clubname=' . $name .;
    //   // Prepare statement
    //   $stmt = $this->conn->prepare($query);
    //   // Execute query
    //   $stmt->execute();
    //   return $stmt;
    }
