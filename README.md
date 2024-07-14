# BallonPathPlaner
A hot air balloon or tethered balloon is dependent on the direction in which the wind is blowing. Based on the wind direction, the balloonist can decide whether he can reach a destination and, if so, at what altitude he must fly the balloon.

# Context 

First challenge of Kevin Chromiks Minihackathon, starting 14th of July. https://www.youtube.com/@KevinChromik https://minihackathon.de/gdge/

# Requirements
consuming data from https://api.open-meteo.com/

# Concept

- Give the place of departure
- Give the place of distination of choice
- Get the coordinates of the two places
- Calulate the Course angle from the start to the end https://de.wikipedia.org/wiki/Kurswinkel
- Consume the wind direction for the different heights per hour at the start location
- Compare the course angle with the given wind directions
- Reports whether the balloon can reach the destination and at what hour and altitude the balloonist can take the balloon to the destination
