package dev.neuralnexus.taterutils.common.commands;

import dev.neuralnexus.taterlib.common.command.Command;
import dev.neuralnexus.taterlib.common.command.Sender;
public class WarpCommand implements Command {
    private String name = "warp";

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return "Allows players to Send a teleport request to another player!";
    }

    @Override
    public String getUsage() {
        return "/warp [list/location name]";
    }

    @Override
    public String getPermission() {
        return "taterutils.command.warp";
    }

    @Override
    public String execute(String[] args) {
        return null;
    }

    @Override
    public boolean execute(Sender sender, String label, String[] args) {
        return true;
    }
}
