# API Doc
[back to README](README.md)
## Public Members
  ### Niagara Station
  - **{ BResoluteReady }** : Main niagara component, and entry point of the project.
    ##### Niagara Properties:
    - **{ BHelpDocModel *hidden*} help-doc**: instance of the BHelpDocModel
    - **{ Integer *hidden* } time-per-point**: Amount of time it will take to 
    get the system to each point fixed (in minutes).                
    - **{ Integer *hidden*} max-time-to-finish:** Max amount of time one can expect to
    spend to labor in order to get the Niagara station to be Resolute 
    Ready. The score's 0 - 100 inclusive range is inversely proportional to
    the range of time between the Resolute Ready station wich should take zero
    minutes before integrating, longest it could take before being able to
    integrate, which is the value configured through this property.     
    - **{ Integer, *readonly*, *atomic*  } total-bad-points**: total number of bad 
    points the program found.       
    - **{ BReadinessScore } score**:  Instance of BReadinessScore.
    - **{ BPointLog } log**: BComponent that exists only to bind the point-log-view. 
    When double-left clicked it will invoke the checkIt action and display the view
    with data updated by the checkIt action, which will also update the score
    widget on the property sheet, but on a separate thread.  
    ##### Niagara Actions:
    - **{ return: null, params: null } checkIt**: calls an asynchronous job which in 
    order to fill up the point-log. It also calls a Runnable object to compute the score
    and set the state once the total number of bad points are known. 
---
  - **{ BITable } BPointLog**: It sets the total number of bad points readony property. 
  It satisfies BITable and the Niagara TableModel.
    ##### Niagara Properties
    ##### Niagara Actions
---
  - **{ Runnable } log-meister**: the process that creates and populates an instance of PointLog.
    ##### Niagara Properties
    ##### Niagara Actions 
---  
  - **{ Runnable } score-meister**: It satisfies scoring asynchrounously and decoupled from
    the point-log job. It runs as soon as the total number of bad points is known.
    ##### Niagara Properties
    ##### Niagara Actions
---
  - **{ BHelpDocModel }**: An html or xml string with the help markup and content.
    ##### Niagara Properties
    ##### Niagara Actions
---    
  - **{ BReadinessScore }**: A niagara object containing the numerical readiness scoring value, 
  one of three possible states of readiness (GREEN, YELLOW, RED), and a legend which is also a 
  part of the enum backed by a HashMap.  
    ##### Niagara Properties
    ##### Niagara Actions  
    ##### Methods
---  
  ### Niagara UI
  - **{BWbComponentView } BResoluteReadinessView**: Main View and parent to all the GUI widgets.
    ##### Niagara Properties
---
  - **{ BWidget } BScoreWidget**: A widget displaying the most relevant information about the station's
  readiness to be integrated into the Resolute cloud product.It loads the running instance of BReadinessScore.
    ##### Niagara Properties
---
  - **{ BWidget } BHelpWidget**: A help (read-only) document explaining what the problem the component
  solves, and how it is used. It loads the running instance of BHelpDocModel.
    ##### Niagara Properties
---
  - **{ BWidget } BPointLogWidget**: A table of all the points that were flagged by the program 
  as requiring significant extra work to make Resolute Ready. It can be toggled on or off. It loads 
  the running instance of BPointLog.
    ##### Niagara Properties
    - **{ BTable } table**: Backed by model
    - **{ TableModel } model**: It uses the loaded instance of BPointLog as a BITable.
    