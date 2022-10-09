Feature: Explore
  
  Scenario Outline: As a user I can explore music by moods
    Given The website "https://music.youtube.com" is opened using Chrome
    When Explore tab is tapped
    And Moods and genres button is tapped
    And A "<Mood>" is selected
    Then The page is displayed correctly
    Examples:
    | Mood            |
    | Chill           |
    | Commute         |
    | Energy Boosters |
    | Feel Good       |
    | Focus           |
    | Party           |
    | Romance         |
    | Sleep           |
    | Workout         |