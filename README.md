# RecipeFinder 🍳

A simple and efficient Android recipe discovery application that helps users search for delicious recipes and filter results based on their preferences. Built with Java and XML, powered by online recipe APIs.

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Screenshots](#screenshots)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [API Integration](#api-integration)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## 🎯 Overview

RecipeFinder is a straightforward Android application designed to make recipe discovery simple and enjoyable. Users can search for recipes from a vast online database and apply various filters to find exactly what they're looking for. The app focuses on core functionality with a clean, intuitive interface.

### Why RecipeFinder?

- 🔍 **Easy Recipe Search** - Find recipes quickly with keyword search
- 🏷️ **Smart Filtering** - Filter recipes by cuisine, meal type, and more
- 📱 **Simple Interface** - Clean and user-friendly Android design
- 🌐 **Online Database** - Access to thousands of recipes via API
- ⚡ **Fast Performance** - Lightweight app with quick search results

## ✨ Features

### 🔍 **Core Features**
- **Recipe Search** - Search recipes by name, ingredient, or keyword
- **Advanced Filtering** - Filter results by:
  - Cuisine type (Italian, Chinese, Mexican, Indian, etc.)
  - Meal type (Breakfast, Lunch, Dinner, Dessert)
  - Recipe category (Appetizers, Main Course, Beverages)
  - Cooking time (Quick, Medium, Long)
- **Recipe Details** - View complete recipe information including ingredients and instructions
- **Recipe Images** - High-quality food images for visual appeal
- **Favorites** - Save recipes to favorites for quick access
- **Search History** - Track recently searched recipes

### 📱 **User Interface**
- **Material Design** - Modern Android UI following Material Design guidelines
- **Responsive Layout** - Optimized for different screen sizes
- **Smooth Navigation** - Intuitive navigation between screens
- **Loading Indicators** - Clear feedback during API calls
- **Error Handling** - User-friendly error messages

### 🌐 **API Integration**
- **Real-time Data** - Fetch recipes from online API sources
- **Image Loading** - Efficient image loading and caching
- **Network Handling** - Robust network error handling
- **Data Parsing** - JSON response parsing and display

## 📸 Screenshots

### Main Application Screens

#### Home & Search
<p align="center">
  <img src="https://github.com/prashant000000004/RecipeFinder/blob/8c3d529fc96a93a299afc379e53aa61893a02ee4/r1.jpeg" width="200" alt="Home Screen">
  &nbsp;&nbsp;&nbsp;
  <img src="https://github.com/prashant000000004/RecipeFinder/blob/8c3d529fc96a93a299afc379e53aa61893a02ee4/r2.jpeg" width="200" alt="Search Screen">
</p>
<p align="center">
  <strong>Home Screen</strong>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <strong>Search Screen</strong>
</p>

#### Filter & Categories
<p align="center">
  <img src="https://github.com/prashant000000004/RecipeFinder/blob/8c3d529fc96a93a299afc379e53aa61893a02ee4/r3.jpeg" width="200" alt="Filter Options">
  &nbsp;&nbsp;&nbsp;
  <img src="https://github.com/prashant000000004/RecipeFinder/blob/8c3d529fc96a93a299afc379e53aa61893a02ee4/r4.jpeg"width="200" alt="Cuisine Filter">
</p>
<p align="center">
  <strong>Filter Options</strong>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <strong>Cuisine Filter</strong>
</p>

#### Recipe Details
<p align="center">
  <img src="https://github.com/prashant000000004/RecipeFinder/blob/8c3d529fc96a93a299afc379e53aa61893a02ee4/r5.jpeg" width="200" alt="Recipe Details">
  &nbsp;&nbsp;&nbsp;
  <img src="https://github.com/prashant000000004/RecipeFinder/blob/8c3d529fc96a93a299afc379e53aa61893a02ee4/r6.jpeg" width="200" alt="Similar Recipes">
</p>
<p align="center">
  <strong>Recipe Details</strong>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <strong>Ingredients List</strong>
</p>


## 🛠️ Technologies Used

### **Android Development**
- **Java** - Primary programming language
- **XML** - UI layout and design
- **Android SDK** - Android development framework
- **Material Design Components** - UI components

### **Networking & API**
- **Retrofit** - HTTP client for API calls
- **OkHttp** - HTTP client library
- **Gson** - JSON serialization/deserialization
- **Glide** / **Picasso** - Image loading and caching

### **External APIs**
- **Spoonacular API** - Recipe database and search
- **Edamam Recipe API** - Recipe information and images
- **TheMealDB API** - Free recipe database

### **Development Tools**
- **Android Studio** - Integrated Development Environment (IDE)
- **Gradle** - Build automation tool
- **Git** - Version control
- **Postman** - API testing

### **UI/UX**
- **Material Design** - Design system
- **ConstraintLayout** - Layout manager
- **RecyclerView** - Efficient list display
- **CardView** - Material card design

## 📋 Prerequisites

Before running this application, ensure you have:

- **Android Studio** (latest version recommended)
- **Java Development Kit (JDK)** 8 or higher
- **Android SDK** (API level 21 or higher)
- **Git** - Version control
- **Internet Connection** - For API calls
- **API Keys** from recipe service providers

### **Minimum Android Requirements:**
- **Android Version:** 5.0 (API level 21) or higher
- **RAM:** 2GB minimum
- **Storage:** 100MB free space

## 🚀 Installation

### 1. Clone the Repository
```bash
git clone https://github.com/prashant000000004/RecipeFinder.git
cd RecipeFinder
```

### 2. Open in Android Studio
- Launch Android Studio
- Select "Open an existing Android Studio project"
- Navigate to the cloned RecipeFinder directory
- Click "Open"

### 3. Get API Keys
Register and get API keys from:
- **Spoonacular API**: [https://spoonacular.com/food-api](https://spoonacular.com/food-api)
- **Edamam Recipe API**: [https://developer.edamam.com/](https://developer.edamam.com/)
- **TheMealDB API**: [https://www.themealdb.com/api.php](https://www.themealdb.com/api.php)

### 4. Configure API Keys
Create or edit the `gradle.properties` file or constants class:

```java
// In Constants.java or ApiConfig.java
public class Constants {
    public static final String SPOONACULAR_API_KEY = "your_spoonacular_api_key_here";
    public static final String SPOONACULAR_BASE_URL = "https://api.spoonacular.com/recipes/";
    public static final String EDAMAM_APP_ID = "your_edamam_app_id";
    public static final String EDAMAM_APP_KEY = "your_edamam_app_key";
    public static final String EDAMAM_BASE_URL = "https://api.edamam.com/search";
}
```

### 5. Sync Project
- Click "Sync Now" when prompted
- Wait for Gradle sync to complete

### 6. Build and Run
- Connect an Android device or start an emulator
- Click the "Run" button (green triangle) in Android Studio
- Select your target device
- Wait for the app to build and install

## ⚙️ Configuration

### **API Configuration**

#### Gradle Dependencies (app/build.gradle):
```gradle
dependencies {
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.9.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    
    // Networking
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    implementation 'com.squareup.okhttp3:logging-interceptor:4.11.0'
    
    // Image loading
    implementation 'com.github.bumptech.glide:glide:4.15.1'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.15.1'
    
    // RecyclerView
    implementation 'androidx.recyclerview:recyclerview:1.3.0'
    implementation 'androidx.cardview:cardview:1.0.0'
}
```

#### Network Security Configuration (network_security_config.xml):
```xml
<?xml version="1.0" encoding="utf-8"?>
<network-security-config>
    <domain-config cleartextTrafficPermitted="true">
        <domain includeSubdomains="true">api.spoonacular.com</domain>
        <domain includeSubdomains="true">api.edamam.com</domain>
        <domain includeSubdomains="true">www.themealdb.com</domain>
    </domain-config>
</network-security-config>
```

#### Manifest Permissions (AndroidManifest.xml):
```xml
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />

<application
    android:networkSecurityConfig="@xml/network_security_config"
    ... >
</application>
```

## 🎮 Usage

### **For Users:**

#### 1. **Recipe Search**
- Open the app and enter a recipe name or ingredient in the search bar
- Tap the search button to get results
- Browse through the list of recipes with images

#### 2. **Apply Filters**
- Tap the filter icon on the search screen
- Select cuisine type (Italian, Chinese, Mexican, etc.)
- Choose meal type (Breakfast, Lunch, Dinner, Dessert)
- Select cooking time preference
- Apply filters to refine search results

#### 3. **View Recipe Details**
- Tap on any recipe card from the search results
- View recipe image, title, and description
- Scroll down to see complete ingredients list
- Read step-by-step cooking instructions
- Save recipe to favorites if desired

#### 4. **Manage Favorites**
- Access favorites from the main menu
- View all saved recipes
- Remove recipes from favorites if needed
- Quick access to your preferred recipes

## 🔌 API Integration

### **Recipe Search Implementation:**

#### API Service Interface:
```java
public interface RecipeApiService {
    @GET("complexSearch")
    Call<RecipeSearchResponse> searchRecipes(
        @Query("apiKey") String apiKey,
        @Query("query") String query,
        @Query("cuisine") String cuisine,
        @Query("type") String mealType,
        @Query("number") int number
    );
    
    @GET("{id}/information")
    Call<RecipeDetails> getRecipeDetails(
        @Path("id") int recipeId,
        @Query("apiKey") String apiKey
    );
}
```

#### Network Manager:
```java
public class NetworkManager {
    private static final String BASE_URL = "https://api.spoonacular.com/recipes/";
    private RecipeApiService apiService;
    
    public NetworkManager() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        
        apiService = retrofit.create(RecipeApiService.class);
    }
    
    public void searchRecipes(String query, String cuisine, String mealType, 
                             Callback<RecipeSearchResponse> callback) {
        Call<RecipeSearchResponse> call = apiService.searchRecipes(
            Constants.API_KEY, query, cuisine, mealType, 12
        );
        call.enqueue(callback);
    }
}
```

#### Recipe Search Activity:
```java
private void searchRecipes() {
    String query = searchEditText.getText().toString().trim();
    if (query.isEmpty()) return;
    
    showLoading(true);
    
    networkManager.searchRecipes(query, selectedCuisine, selectedMealType, 
        new Callback<RecipeSearchResponse>() {
            @Override
            public void onResponse(Call<RecipeSearchResponse> call, 
                                 Response<RecipeSearchResponse> response) {
                showLoading(false);
                if (response.isSuccessful() && response.body() != null) {
                    displayRecipes(response.body().getResults());
                } else {
                    showError("Failed to fetch recipes");
                }
            }
            
            @Override
            public void onFailure(Call<RecipeSearchResponse> call, Throwable t) {
                showLoading(false);
                showError("Network error: " + t.getMessage());
            }
        });
}
```

## 📁 Project Structure

```
RecipeFinder/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/yourpackage/recipefinder/
│   │   │   │   ├── activities/          # Activity classes
│   │   │   │   │   ├── MainActivity.java
│   │   │   │   │   ├── SearchActivity.java
│   │   │   │   │   ├── RecipeDetailActivity.java
│   │   │   │   │   └── FavoritesActivity.java
│   │   │   │   ├── adapters/            # RecyclerView adapters
│   │   │   │   │   ├── RecipeAdapter.java
│   │   │   │   │   └── IngredientsAdapter.java
│   │   │   │   ├── models/              # Data models
│   │   │   │   │   ├── Recipe.java
│   │   │   │   │   ├── RecipeDetails.java
│   │   │   │   │   ├── Ingredient.java
│   │   │   │   │   └── RecipeSearchResponse.java
│   │   │   │   ├── network/             # API and networking
│   │   │   │   │   ├── RecipeApiService.java
│   │   │   │   │   ├── NetworkManager.java
│   │   │   │   │   └── ApiClient.java
│   │   │   │   ├── utils/               # Utility classes
│   │   │   │   │   ├── Constants.java
│   │   │   │   │   ├── ImageLoader.java
│   │   │   │   │   └── NetworkUtils.java
│   │   │   │   └── fragments/           # Fragment classes (if used)
│   │   │   │       ├── SearchFragment.java
│   │   │   │       └── FilterFragment.java
│   │   │   ├── res/
│   │   │   │   ├── layout/              # XML layout files
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   ├── activity_search.xml
│   │   │   │   │   ├── activity_recipe_detail.xml
│   │   │   │   │   ├── item_recipe.xml
│   │   │   │   │   └── item_ingredient.xml
│   │   │   │   ├── values/              # Resources
│   │   │   │   │   ├── strings.xml
│   │   │   │   │   ├── colors.xml
│   │   │   │   │   ├── dimens.xml
│   │   │   │   │   └── styles.xml
│   │   │   │   ├── drawable/            # Icons and images
│   │   │   │   ├── menu/                # Menu files
│   │   │   │   └── xml/                 # Network config
│   │   │   └── AndroidManifest.xml
│   ├── build.gradle                     # App-level Gradle file
│   └── proguard-rules.pro
├── gradle/
├── build.gradle                         # Project-level Gradle file
├── gradle.properties
├── settings.gradle
└── README.md
```

## 🧪 Testing

### **Manual Testing:**
- Test recipe search with various keywords
- Verify filter functionality works correctly
- Check recipe details display properly
- Test favorites add/remove functionality
- Verify network error handling
- Test on different screen sizes

### **API Testing:**
```bash
# Test API endpoints using curl or Postman
curl "https://api.spoonacular.com/recipes/complexSearch?apiKey=YOUR_API_KEY&query=chicken"
```

## 🚀 Deployment

### **Generate APK:**

#### Debug APK:
```bash
# In Android Studio
Build -> Build Bundle(s) / APK(s) -> Build APK(s)

# Or using Gradle
./gradlew assembleDebug
```

#### Release APK:
```bash
# Generate signed APK
Build -> Generate Signed Bundle / APK -> APK

# Or using Gradle (after configuring signing)
./gradlew assembleRelease
```

### **App Store Deployment:**
1. **Generate signed AAB** (Android App Bundle)
2. **Upload to Google Play Console**
3. **Configure app listing and pricing**
4. **Submit for review**

## 🤝 Contributing

We welcome contributions to RecipeFinder! Here's how you can help:

### **How to Contribute:**
1. Fork the repository
2. Create a feature branch (`git checkout -b feature/awesome-feature`)
3. Make your changes
4. Test thoroughly on multiple devices
5. Commit your changes (`git commit -m 'Add awesome feature'`)
6. Push to the branch (`git push origin feature/awesome-feature`)
7. Open a Pull Request

### **Contribution Areas:**
- UI/UX improvements
- Additional filter options
- New recipe API integrations
- Performance optimizations
- Bug fixes and improvements
- Code documentation

## 🗺️ Roadmap

### **Upcoming Features:**
- [ ] **Voice Search** - Search recipes using voice commands
- [ ] **Recipe Categories** - Browse recipes by predefined categories
- [ ] **Random Recipe** - Discover random recipes
- [ ] **Recent Searches** - Track and display recent search history
- [ ] **Improved Filters** - More granular filtering options
- [ ] **Better Error Handling** - Enhanced network error management
- [ ] **App Theme** - Dark mode support
- [ ] **Recipe Sharing** - Share recipe links with friends

### **Technical Improvements:**
- [ ] **Caching** - Implement local caching for better performance
- [ ] **Pagination** - Load more recipes on scroll
- [ ] **Image Optimization** - Better image loading and compression
- [ ] **Offline Indicators** - Show network status
- [ ] **Unit Tests** - Add comprehensive testing
- [ ] **Performance Optimization** - Reduce app size and improve speed

## 🐛 Known Issues

- Recipe images may load slowly on slow internet connections
- API rate limits may affect search frequency
- Some recipes may have incomplete ingredient information
- Filter combinations might return limited results

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📞 Contact

**Prashant** - [@prashant000000004](https://github.com/prashant000000004)

Project Link: [https://github.com/prashant000000004/RecipeFinder](https://github.com/prashant000000004/RecipeFinder)

## 🙏 Acknowledgments

- **Spoonacular API** - For providing comprehensive recipe database
- **Edamam API** - For recipe search and nutritional information
- **TheMealDB** - For free recipe database access
- **Material Design** - For beautiful UI components and guidelines
- **Android Community** - For excellent documentation and support
- **Open Source Libraries** - Retrofit, Glide, and other amazing tools

---

## 📊 Project Info

![Android](https://img.shields.io/badge/Platform-Android-green.svg)
![Java](https://img.shields.io/badge/Language-Java-orange.svg)
![API](https://img.shields.io/badge/API-21%2B-blue.svg)
![License](https://img.shields.io/badge/License-MIT-yellow.svg)

⭐ **If you found this project helpful, please give it a star!** ⭐

---

### 🍽️ **Happy Cooking with RecipeFinder!** 👨‍🍳👩‍🍳
