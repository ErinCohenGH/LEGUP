package history;

public abstract class PuzzleCommand implements ICommand
{
    /**
     * Redoes an command
     */
    public void redo()
    {
        execute();
    }
}
