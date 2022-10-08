Feature: Explore
  
  Scenario: As a user I can explore music by mood and genres
    Given The website "https://music.youtube.com" is opened using Chrome
    When Explore tab is tapped
    And Moods and genres button is tapped