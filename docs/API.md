# API Doc
[back to README](README.md)
### Public Members
  #### Niagara Station
  - BResoluteReady
    ##### Niagara Properties:
    - { Integer } time-per-point: Amount of time it will take to 
                get the system to each point fixed (in minutes).
                
    - { Integer } max-time-to-finish: Max amount of time one can expect to
      spend to labor in order to get the Niagara station to be Resolute 
      Ready. The score's 0 - 100 inclusive range is inversely proportional to
      the range of time between the Resolute Ready station wich should take zero
      minutes before integrating, longest it could take before being able to
      integrate, which is the value configured through this property.
      
    - { Integer, *readonly*, **atomic**  } total-bad-points: total number of bad 
      points the program found.  
      
    - { BReadinessScore } score: A niagara object containing the numerical
      readiness scoring value, one of three possible states of readiness (GREEN, 
      YELLOW, RED), and a legend which is also a part of the enum backed by a HashMap.
      
    ##### Niagara Actions:
    - { return: null, params: null } checkIt: calls an asynchronous job which in 
    order to fill up the point-log. It also calls a Runnable object to compute the score
    and set the state once the total number of bad points are known. 
    
  - { BITable } AbstractPointLog: A table object that satisfies the contract with BITable.
  - { BSimpleJob } job: Build the point-log table.    
  #### Niagara UI
  - { BWbComponentView } BPointLogView
    ##### Niagara Properties
    - { BTable } PointLogTable: A table of all the points that were flagged by the program
         as requiring significant extra work to make Resolute Ready. The PointLog will be
         ready to be loaded into and subscribed to a BWidget or BWbComponentView for UI
    - { TableModel } PointLogTableModel: a BTableModel to back the BTable .
### Private Members
  - { PointLog } pointLog: The implementation of AbstractPointLog. It sets the total number
    of bad points readony property. It satisfies BITable and the Niagara TableModel.
  
  - { Runnable } score-meister: It satisfies scoring asynchrounously and decoupled from
    the point-log job. It runs as soon as the total number of bad points is known.