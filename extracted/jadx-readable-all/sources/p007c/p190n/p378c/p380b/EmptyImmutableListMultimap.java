package p007c.p190n.p378c.p380b;

/* JADX INFO: renamed from: c.n.c.b.o, reason: use source file name */
/* JADX INFO: compiled from: EmptyImmutableListMultimap.java */
/* JADX INFO: loaded from: classes.dex */
public class EmptyImmutableListMultimap extends ImmutableListMultimap<Object, Object> {

    /* JADX INFO: renamed from: k */
    public static final EmptyImmutableListMultimap f26246k = new EmptyImmutableListMultimap();

    public EmptyImmutableListMultimap() {
        super(RegularImmutableMap.f26222i, 0);
    }

    private Object readResolve() {
        return f26246k;
    }
}
