package ai.labs.channels.differ.model;

import ai.labs.channels.differ.model.commands.Command;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommandInfo implements Serializable {
    private String exchange;
    private String routingKey;
    private Command command;
    private long sendingDelay;
    private long minSentAt;
    private int sequenceNumber;
}