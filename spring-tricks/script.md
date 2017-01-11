40 Tips & Tricks for Spring in IntelliJ IDEA

## Preparation
Use IntelliJ IDEA 2016.2 (EAP).

Use Presentation Mode, check font size (File | Settings | Appearance & Behavior | Appearance).

Show shortcuts!

Adjust Documentation Font Size in Spring toolwindow.



## General/Navigation

### Spring Facet/Contexts
Open Project. Notice "Spring Configuration Check" notification.
Explain necessity to setup contexts. Use "Create Default Context" for simple apps.
If there's an autodetected context, you will be notified (SB/MVC), can add additional manual context.

Open `MainConfiguration`, apply "Create Spring Facet", gutter icons etc. start working.
Open Test, no need for setup.

Mention "parent context" (used in Spring MVC automatically).

Open "Spring Models Diagram" to visualize the full context graph.
In `importedXml.xml`: uncomment 2nd `<component-scan>` to visualize cycle detection.

### Code: Navigating the context
Open `MainConfiguration`. Demonstrate `@ComponentScan` gutter and code insight on `@ImportXX` annotations.

Uncomment `@MyComponentScan` and demonstrate `@AliasFor` support.

"File | Settings | Editor | General | Gutter Icons" can be used to customize.


### Spring Toolwindow
Demonstrate basic functionality. Toggle implicit/infrastructure (`@ComponentScan`/`<component-scan>`) beans.

"Navigate -> Select In..." from `@Bean` to select it in tool window.



## Working with Code

### @Autowiring and @Profile
"Change Active Spring Profiles": enable "mainProfile".

`MainConfiguration#autowiredLongBean`: demonstrate "Add @Qualifier" quickfix.

`#beanFromMainConfiguration`: "Generate -> @Autowired Dependency" -> Environment.

Demonstrate "Convert to CTOR parameter" quickfix and explain motivation.

Activate "customProfile" in IDE. Existing `@Qualifier` becomes invalid, remove it.
No more autowiring error due to switch to `CustomProfileConfiguration`.


### Caching
Setup `CachingConfig` context.

`CachingService` & `CachingServiceImpl`: `@Cacheable` inspections and code insight.


### EL
Spring EL color scheme can now be configured

`CachingServiceImpl`: autocompletion, rename parameter, `#root`

`OrderService`: `@PreAuthorize` code insight

`OrderService`: navigate to listener, EL expression in `OrderEventProcessor`



## Working with XML
Add XML to new context.

`SimpleBean#setAutowiredBean`: gutter navigation, navigate to autowired dependency.

Duplicate bean definition `autowiredBean`, "Show bean candidates", "View | Quick Definition"

Intention "Make autowired dependencies explicit" on `default-autowire=byType`

Intention to convert `<property>` to p-namespace attribute

`SimpleBean`: add dummy property and generator CTOR, XML highlights "No matching constructor" + quickfix

Use `ref` on generated `<constructor-arg>`, intention to create new bean from usage

Add `spring.io.Resource` property, code-insight, quickfix to create missing file


"Generate by Pattern" -> "Property Placeholder Configurer" using `myProperties.properties`, `${..}` reference



## Spring MVC
Make sure Web facet exists and web resource path `/` is mapped to `/web/`

Auto-configuration via `DispatcherServletInitializer`, detects `ViewResolver` code setup etc.

Gutter icon in `MyController` and "Goto Related" from view

"Goto Symbol": navigate to request mapping by entering `/`-prefix

Spring toolwindow MVC tab, note `/redirectUrl`

`MyController.requestMappingWithPathVariable`: code-insight, refactoring




## Spring Boot
Wizard: demonstrate search, disabled dependencies have tooltip to show required SB version

Choose `Web` and create project

SB Main class: model graph "Show library models" to visualize autoconfig

Add `@EnableWebSocket`, quickfix to add corresponding starter

Create dummy `@ConfigurationProperties` class with `String` property, setup annotation-processor with c/p from doc

Use key in `application.properties`, "Find Usages" on setter navigates to this usage

Add `META-INF/additional-spring-configuration-metadata.json` and add some hints

Demonstrate using SB run configuration, duplicate run config and overriding configuration keys



## Spring API
Spring plugin can extended or used from your custom plugin via [Spring OpenAPI](http://www.jetbrains.org/intellij/sdk/docs/reference_guide/frameworks_and_external_apis/spring_api.html)
