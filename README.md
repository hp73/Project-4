Project #4
CS 209 Fall 2019
By Harry Pinkerton and Laurie Jones

===Features===
--Save Image W/ A File Chooser--
- Implements JFileChooser to save a Screenshot of the image displayed on Canvas
- Default path is current Directory for Saving
- Image set as a png

--Change Colors with PreSets--
- Dropdown JComboBox to choose between different Gradients
- Options Include: BlueScale, GreyScale, and Rainbow
- No Popup/ Display of Gradient

--Save/Load Position--



--Julia Set--
- Dropdown JComboBox to choose between Julia and Mandelbrot Sets
- Displays image on the Canvas
- implements all other features.


===MandelBrot===
When run, displays all of the JButtons, JComboBoxes, and the Canvas in a GUI.
--Variables--
Canvas: Displays the Canvas from the Canvas Class
JButtons: Create Clickable entities on the GUI with actionListeners to perform actions on the Canvas.
JComboBoxes: Create un-editable, Clickable dropdown boxes to choose between different options. Contains an actionlistener mapped to each of the items in the set for each ComboBox.
JFileChooser: Used to choose a location to save a png file of the Canvas.

===Canvas===
Takes values from setCalculator and saves them to display on the GUI. Also contains methods to keep values consistent among different classes.

--Variables--
r: Instance of a Rainbow object from the Rainbow Class
newLim: new limit calculated from setCalculator after the limit is changed from a JButton.
setC: Insance of a setCalculator object from the setCalculator Class.
doneRendering: boolean that determines if the Canvas is done rendering chunks.
RenderX: renders x values.
RenderY: renders y values.
scale: determines size of the canvas.
posStart: determines where the mouse was first clicked on the canvas.
posEnd: determines where the mouse was relseased on the canvas.

--Methods--
increaseLimit(): saves the new doubled limit in both the rainbow object and setcalculator object simultaneously.
decreaseLimit():saves the new halved limit in both the rainbow object and setcalculator object simultaneously.
resetLimit(): saves the reset limit in both the rainbow object and setcalculator object simultaneously.
Render(): determines what colors in the rainbowclass need to be mapped to pixels on the canvas.

===Rainbow===
Creates a Gradient by interpolation between different seed colors. Contains a rainbow gradient, bluescale, and greyscale.
--Variables--
Rainbow instance: returns an instance of the rainbow object
colors: array that stores the interpolated gradient.
seeds: array that stores the seeds of a particular gradient.
index: index position at the colors array.
limit: the size of the colors array.
--Methods--
createGradient: Adds the interpolated colors to the colors array by determining the ratio between each seeds' RBG values.
getColor: Gets a color at a certain index in the colors array.
setGradient: Determines what gradient to display on the canvas.
setLimit: sets the limit to be equivalent to the setcalculators' limit.

===setCalculator===
Calculated the shading of the MandelBrot and Julia Sets and also keeps track of the display on Canvas.
--Variables--
xMax: highest xvalue to display on the canvas.
xMin: lowest xvalue to display on the canvas.
yMax: highest yvalue to display on the canvas.
yMin: lowest xvalue to display on the canvas.
limit: determines how many unique colors are to be mapped to each set.
--Methods--
resetButton: Resets all of the variables to their default value.
setLimit: Sets limit to be the same as the rainbow object on Canvas.
dragZoom: recalculates the values for the corners of Canvas to be re-rendered to see closer up on the Canvas.
SpillTheT: calculates the escape function for Mandelbrot
