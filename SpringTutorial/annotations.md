@Required - обязательное заполнение на этапе конфигураций
@AutoWired - Возможность уточноть поиск бинов для внедрения(по дефолту ищет по типу)
@Qualifier - для уточнени автоматического связывания(по имени уже позвоялет)


@Component используется со всеми классами, которыми должен управлять Spring.
 Когда Spring видит класс с @Component, Spring определяет этот класс как кандидата для создания bean.
         
@Bean В классах конфигурации Spring, @Bean используется для определения компонентов с кастомной логикой.
@Scope

@Configuration declare that this class provides one or more @Bean methods and may be processed by the Spring container
 to generate bean definitions and service requests for those beans at runtime.
 
@Component Scan - find class's config(find service,controller). don't find interface. only one scan before start app