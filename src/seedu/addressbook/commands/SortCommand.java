package seedu.addressbook.commands;

public class SortCommand extends Command {
    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sort the current list of people in the addressbook in alphabetical order.\n";

    public static final String MESSAGE_SORTING_SUCCESS = "Sorting success.";

    @Override
    public CommandResult execute() {
        addressBook.sortAddressBook();
        return new CommandResult(MESSAGE_SORTING_SUCCESS);
    }
}
