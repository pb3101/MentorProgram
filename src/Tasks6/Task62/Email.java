package Tasks6.Task62;

/**
 * Created by pavlo.balyuk on 10/3/2017. Task 6.2. Implement Builder for Main object with fields: to(string), cc(string),
 * subject(string), body(string), priority(int), attachment(boolean: true/false)
 */
 class Email {

    private String to;
    private String cc;
    private String subject;
    private String body;
    private int priority;
    private boolean attachment;

    @Override
    public String toString() {
        return "Email{" +
                "to='" + to + '\'' +
                ", cc='" + cc + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", priority=" + priority +
                ", attachment=" + attachment +
                '}';
    }

    public static class Builder {

        private String to;
        private String cc;
        private String subject;
        private String body;
        private int priority;
        private boolean attachment;

        public Builder(int priority) {
            this.priority = priority;
        }

        public Builder attachment(boolean value) {
            attachment = value;
            return this;
        }

        public Builder to(String to) {
            this.to = to;
            return this;
        }

        public Builder cc(String cc) {
            this.cc = cc;
            return this;
        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Email build() {
            return new Email(this);
        }
    }

    private Email(Builder builder) {
        to = builder.to;
        cc = builder.cc;
        subject = builder.subject;
        body = builder.body;
        priority = builder.priority;
        attachment = builder.attachment;
    }
}
