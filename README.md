# SpringBackend

## zacatie projektu
start.string.io
switch to full version
rozsirenia : web, jpa, thymleaf, h2 -db
import project/pom seleknuť

#kompomenty
@Service @Componets  - bean
@Autowired  na injection pre set, atribut alebo kontruktor
bean objekty ktore managuje string
scope ,  ako a kedy sa vytvory bean siglton - raz sa vytvori
						prototype - bean sa stale vytvory na novo
					Request...	


viac instancii rozhrania @Qualifier("id")	alebo nazov premennej ako idalebo @Primary


profily - pre dve typy en/sk alebo 2db	

view / thymeleaf alebo jbc	

#Konfiguracie :
xml - starsia
anotačná - preferovana spring scan
java konfiguracia - trieda anotacia Configuration, metody s anotaciou Bean	
Groovy

#Streotypy -
spring scan hlada stereotypy 
@Component - hierarchichy najvysie pre vsetky predok 
@Controller
@Repository 
@RestController 
@Service


@ComponentScan()  // pre scanovanie tried mino balicek , ktorý spring skanuje
			prepise defaulne nastavenie, to co stale skenuje uz nebude skenovať

@Configuration
@Bean  do vlastneh triedy s instanciu danej triedy z vonku  
			    // ak chcem dat do bean springu triedy z vonku
@ImportResource("classpath:bean-configurator.xml")	//druha možnosť xml konfiguracia


@Bean  // pri metode ak vracia instaciu, ktora nema service, ktoru chcem ako bean narp. pri factory

@Configuration
@PropertySource("classpath:jozko.properties")   // ak mame vlastny properties a chceme ziskat premenne
@Value("${jozko.priezvisko}")      // ak to nee spring boot musime urobit bean PropertySourcesPlaceholderConfiger

@PropertySources({@PropertySource("classpath:jozko.properties")}) viac suborov properties


Restfull - webový servis , ktorý používa http


URI /phones
     /phones/2
     /person/10/phones/5    // pridelete, put alebo post ...
	persons?name=Jaro   // strankovať


status kody   200 ....599

hateoas   // zasielanie dodatocnej informavie do json url autora

jax-rs   api restfull

@RestController
@RequestMapping("/api")    //restfull
@GetMapping("/movies")



napojit sa na ine rest  api pomocou Resttemplate a https://www.jsonschema2pojo.org/
alebo rest template si ziskat cez bean
vratenie listu 2 sposoby wraper metoda todolist tato metoda funguje iba vtedy ak by sa vracal objekt obaleny v data: alebo iba v metode




dto   - data transfer object   - iba data, ktore chceme poskytnut kiznica mapStruct mapper na premapovanie triedy 

hateoas   - na linky v json 
