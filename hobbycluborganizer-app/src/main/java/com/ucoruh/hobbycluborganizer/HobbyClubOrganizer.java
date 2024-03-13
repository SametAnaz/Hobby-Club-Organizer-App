/**

@file HobbyClubOrganizer.java
@brief This file serves as a demonstration file for the HobbyClubOrganizer class.
@details This file contains the implementation of the HobbyClubOrganizer class, which provides various mathematical operations.
*/

/**

@package com.ucoruh.hobbycluborganizer
@brief The com.ucoruh.hobbycluborganizer package contains all the classes and files related to the HobbyClubOrganizer App.
*/
package com.ucoruh.hobbycluborganizer;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
/**

@class HobbyClubOrganizer
@brief This class represents a HobbyClubOrganizer that performs mathematical operations.
@details The HobbyClubOrganizer class provides methods to perform mathematical operations such as addition, subtraction, multiplication, and division. It also supports logging functionality using the logger object.
@author ugur.coruh
*/
public class HobbyClubOrganizer {

  /**
   * @brief Logger for the HobbyClubOrganizer class.
   */
  private static final Logger logger = (Logger) LoggerFactory.getLogger(HobbyClubOrganizer.class);

  /**
   * @brief Calculates the sum of two integers.
   *
   * @details This function takes two integer values, `a` and `b`, and returns their sum. It also logs a message using the logger object.
   *
   * @param a The first integer value.
   * @param b The second integer value.
   * @return The sum of `a` and `b`.
   */
  public int add(int a, int b) {
    // Logging an informational message
    logger.info("Logging message");
    // Logging an error message
    logger.error("Error message");
    // Returning the sum of `a` and `b`
    return a + b;
  }
}
