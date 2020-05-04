package iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channelsList;

    public ChannelCollectionImpl() {
        channelsList = new ArrayList<>();
    }

    public void addChannel(Channel c) {
        this.channelsList.add(c);
    }

    public void removeChannel(Channel c) {
        this.channelsList.remove(c);
    }

    @Override
    public ChannelIterator iterator(ChannelType type) {
        return new ChannelIteratorImpl(type, this.channelsList);
    }

    private static class ChannelIteratorImpl implements ChannelIterator {

        private ChannelType type;
        private List<Channel> channels;
        private int position;

        public ChannelIteratorImpl(ChannelType ty,
                                   List<Channel> channelsList) {
            this.type = ty;
            this.channels = channelsList;
        }

        @Override
        public boolean hasNext() {
            while (position < channels.size()) {
                Channel c = channels.get(position);
                if (c.getTYPE() == type || type == ChannelType.ALL) {
                    return true;
                } else {
                    position++;
                }
            }
            return false;
        }

        @Override
        public Channel next() {
            return channels.get(position++);
        }
    }
}
