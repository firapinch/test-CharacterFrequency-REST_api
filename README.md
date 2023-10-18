# Character Frequency REST API

This is a simple REST API that calculates the frequency of characters in a given input string and returns the result in JSON format. The result is sorted in descending order of character frequencies.

## Prerequisites

- Java 8+
- Spring Boot 2+
- Gradle (for building)

## Getting Started

1. Clone this repository to your local machine:

   ```shell
   git clone https://github.com/firapinch/test-CharacterFrequency-REST_api.git
   ```

2. Build the project:

   ```shell
   cd test-CharacterFrequency-REST_api
   gradle build
   ```
3. Run the application:
 
   ```shell
   java -jar build/libs/test-CharacterFrequency-REST_api-0.0.1-SNAPSHOT.jar
   ```
4. The application will start on http://localhost:8080.
## Usage on a localhost

To calculate the character frequency, make a GET request to the following endpoint:

http://localhost:8080/calculate-frequency?input=<your_input_string>

## Using the API in a Real Project

If you want to integrate this API into a real project, follow these steps:

1. **Host the API**: Deploy the API on a remote server or cloud hosting service of your choice.

2. **Access the API**: Once the API is deployed, you can access it using its public URL. Replace `<api-url>` with the actual URL of your deployed API in the examples below.

3. **Make HTTP Requests**: Use HTTP client libraries or tools in your preferred programming language to make HTTP requests to the API. You can send a GET request to calculate character frequency.

   - **Example Request**:

     ```http
     GET http://<api-url>/calculate-frequency?input=your_input_string
     ```

   Replace `<api-url>` with your API's URL and `your_input_string` with the string for which you want to calculate character frequency.

4. **Receive JSON Response**: The API will respond with a JSON object containing character frequencies sorted in descending order.

   - **Example Response**:

     ```json
     {
       "a": 5,
       "c": 4,
       "b": 1
     }
     ```

Remember to provide the actual URL of your deployed API and any additional authentication or authorization details if necessary in your project's documentation.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.



