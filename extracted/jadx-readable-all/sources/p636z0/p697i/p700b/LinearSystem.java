package p636z0.p697i.p700b;

import java.util.Arrays;
import java.util.Objects;
import p636z0.p697i.p700b.p701h.ConstraintAnchor;

/* JADX INFO: renamed from: z0.i.b.d, reason: use source file name */
/* JADX INFO: compiled from: LinearSystem.java */
/* JADX INFO: loaded from: classes.dex */
public class LinearSystem {

    /* JADX INFO: renamed from: a */
    public static boolean f36737a = false;

    /* JADX INFO: renamed from: b */
    public static int f36738b = 1000;

    /* JADX INFO: renamed from: c */
    public static long f36739c;

    /* JADX INFO: renamed from: f */
    public a f36742f;

    /* JADX INFO: renamed from: i */
    public ArrayRow[] f36745i;

    /* JADX INFO: renamed from: o */
    public final Cache3 f36751o;

    /* JADX INFO: renamed from: r */
    public a f36754r;

    /* JADX INFO: renamed from: d */
    public boolean f36740d = false;

    /* JADX INFO: renamed from: e */
    public int f36741e = 0;

    /* JADX INFO: renamed from: g */
    public int f36743g = 32;

    /* JADX INFO: renamed from: h */
    public int f36744h = 32;

    /* JADX INFO: renamed from: j */
    public boolean f36746j = false;

    /* JADX INFO: renamed from: k */
    public boolean[] f36747k = new boolean[32];

    /* JADX INFO: renamed from: l */
    public int f36748l = 1;

    /* JADX INFO: renamed from: m */
    public int f36749m = 0;

    /* JADX INFO: renamed from: n */
    public int f36750n = 32;

    /* JADX INFO: renamed from: p */
    public SolverVariable[] f36752p = new SolverVariable[f36738b];

    /* JADX INFO: renamed from: q */
    public int f36753q = 0;

    /* JADX INFO: renamed from: z0.i.b.d$a */
    /* JADX INFO: compiled from: LinearSystem.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo15676a(SolverVariable solverVariable);

        /* JADX INFO: renamed from: b */
        SolverVariable mo15677b(LinearSystem linearSystem, boolean[] zArr);

        void clear();

        boolean isEmpty();
    }

    public LinearSystem() {
        this.f36745i = null;
        this.f36745i = new ArrayRow[32];
        m15707t();
        Cache3 cache3 = new Cache3();
        this.f36751o = cache3;
        this.f36742f = new PriorityGoalRow(cache3);
        this.f36754r = new ArrayRow(cache3);
    }

    /* JADX INFO: renamed from: a */
    public final SolverVariable m15688a(SolverVariable.a aVar, String str) {
        SolverVariable solverVariableM15709a = this.f36751o.f36735c.m15709a();
        if (solverVariableM15709a == null) {
            solverVariableM15709a = new SolverVariable(aVar, str);
            solverVariableM15709a.f36774k = aVar;
        } else {
            solverVariableM15709a.m15715c();
            solverVariableM15709a.f36774k = aVar;
        }
        int i = this.f36753q;
        int i2 = f36738b;
        if (i >= i2) {
            int i3 = i2 * 2;
            f36738b = i3;
            this.f36752p = (SolverVariable[]) Arrays.copyOf(this.f36752p, i3);
        }
        SolverVariable[] solverVariableArr = this.f36752p;
        int i4 = this.f36753q;
        this.f36753q = i4 + 1;
        solverVariableArr[i4] = solverVariableM15709a;
        return solverVariableM15709a;
    }

    /* JADX INFO: renamed from: b */
    public void m15689b(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        ArrayRow arrayRowM15700m = m15700m();
        if (solverVariable2 == solverVariable3) {
            arrayRowM15700m.f36731d.mo15673i(solverVariable, 1.0f);
            arrayRowM15700m.f36731d.mo15673i(solverVariable4, 1.0f);
            arrayRowM15700m.f36731d.mo15673i(solverVariable2, -2.0f);
        } else if (f == 0.5f) {
            arrayRowM15700m.f36731d.mo15673i(solverVariable, 1.0f);
            arrayRowM15700m.f36731d.mo15673i(solverVariable2, -1.0f);
            arrayRowM15700m.f36731d.mo15673i(solverVariable3, -1.0f);
            arrayRowM15700m.f36731d.mo15673i(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                arrayRowM15700m.f36729b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            arrayRowM15700m.f36731d.mo15673i(solverVariable, -1.0f);
            arrayRowM15700m.f36731d.mo15673i(solverVariable2, 1.0f);
            arrayRowM15700m.f36729b = i;
        } else if (f >= 1.0f) {
            arrayRowM15700m.f36731d.mo15673i(solverVariable4, -1.0f);
            arrayRowM15700m.f36731d.mo15673i(solverVariable3, 1.0f);
            arrayRowM15700m.f36729b = -i2;
        } else {
            float f2 = 1.0f - f;
            arrayRowM15700m.f36731d.mo15673i(solverVariable, f2 * 1.0f);
            arrayRowM15700m.f36731d.mo15673i(solverVariable2, f2 * (-1.0f));
            arrayRowM15700m.f36731d.mo15673i(solverVariable3, (-1.0f) * f);
            arrayRowM15700m.f36731d.mo15673i(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                arrayRowM15700m.f36729b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            arrayRowM15700m.m15678c(this, i3);
        }
        m15690c(arrayRowM15700m);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01a8  */
    /* JADX INFO: renamed from: c */
    public void m15690c(ArrayRow arrayRow) {
        boolean z;
        boolean z2;
        boolean z3;
        SolverVariable solverVariableM15684i;
        SolverVariable.a aVar = SolverVariable.a.UNRESTRICTED;
        boolean z4 = true;
        if (this.f36749m + 1 >= this.f36750n || this.f36748l + 1 >= this.f36744h) {
            m15703p();
        }
        if (arrayRow.f36732e) {
            z = false;
        } else {
            if (this.f36745i.length != 0) {
                boolean z5 = false;
                while (!z5) {
                    int iMo15665a = arrayRow.f36731d.mo15665a();
                    for (int i = 0; i < iMo15665a; i++) {
                        SolverVariable solverVariableMo15666b = arrayRow.f36731d.mo15666b(i);
                        if (solverVariableMo15666b.f36768e != -1 || solverVariableMo15666b.f36771h) {
                            arrayRow.f36730c.add(solverVariableMo15666b);
                        }
                    }
                    int size = arrayRow.f36730c.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            SolverVariable solverVariable = arrayRow.f36730c.get(i2);
                            if (solverVariable.f36771h) {
                                arrayRow.m15686k(this, solverVariable, true);
                            } else {
                                arrayRow.mo15687l(this, this.f36745i[solverVariable.f36768e], true);
                            }
                        }
                        arrayRow.f36730c.clear();
                    } else {
                        z5 = true;
                    }
                }
                if (arrayRow.f36728a != null && arrayRow.f36731d.mo15665a() == 0) {
                    arrayRow.f36732e = true;
                    this.f36740d = true;
                }
            }
            if (arrayRow.isEmpty()) {
                return;
            }
            float f = arrayRow.f36729b;
            if (f < 0.0f) {
                arrayRow.f36729b = f * (-1.0f);
                arrayRow.f36731d.mo15667c();
            }
            int iMo15665a2 = arrayRow.f36731d.mo15665a();
            SolverVariable solverVariable2 = null;
            SolverVariable solverVariable3 = null;
            float f2 = 0.0f;
            boolean z6 = false;
            float f3 = 0.0f;
            boolean z7 = false;
            for (int i3 = 0; i3 < iMo15665a2; i3++) {
                float fMo15668d = arrayRow.f36731d.mo15668d(i3);
                SolverVariable solverVariableMo15666b2 = arrayRow.f36731d.mo15666b(i3);
                if (solverVariableMo15666b2.f36774k == aVar) {
                    if (solverVariable2 == null || f2 > fMo15668d) {
                        boolean zM15683h = arrayRow.m15683h(solverVariableMo15666b2);
                        z6 = zM15683h;
                        f2 = fMo15668d;
                        solverVariable2 = solverVariableMo15666b2;
                    } else if (!z6 && arrayRow.m15683h(solverVariableMo15666b2)) {
                        f2 = fMo15668d;
                        solverVariable2 = solverVariableMo15666b2;
                        z6 = true;
                    }
                } else if (solverVariable2 == null && fMo15668d < 0.0f) {
                    if (solverVariable3 == null || f3 > fMo15668d) {
                        boolean zM15683h2 = arrayRow.m15683h(solverVariableMo15666b2);
                        z7 = zM15683h2;
                        f3 = fMo15668d;
                        solverVariable3 = solverVariableMo15666b2;
                    } else if (!z7 && arrayRow.m15683h(solverVariableMo15666b2)) {
                        f3 = fMo15668d;
                        solverVariable3 = solverVariableMo15666b2;
                        z7 = true;
                    }
                }
            }
            if (solverVariable2 == null) {
                solverVariable2 = solverVariable3;
            }
            if (solverVariable2 == null) {
                z2 = true;
            } else {
                arrayRow.m15685j(solverVariable2);
                z2 = false;
            }
            if (arrayRow.f36731d.mo15665a() == 0) {
                arrayRow.f36732e = true;
            }
            if (z2) {
                if (this.f36748l + 1 >= this.f36744h) {
                    m15703p();
                }
                SolverVariable solverVariableM15688a = m15688a(SolverVariable.a.SLACK, null);
                int i4 = this.f36741e + 1;
                this.f36741e = i4;
                this.f36748l++;
                solverVariableM15688a.f36767d = i4;
                this.f36751o.f36736d[i4] = solverVariableM15688a;
                arrayRow.f36728a = solverVariableM15688a;
                int i5 = this.f36749m;
                m15696i(arrayRow);
                if (this.f36749m == i5 + 1) {
                    ArrayRow arrayRow2 = (ArrayRow) this.f36754r;
                    Objects.requireNonNull(arrayRow2);
                    arrayRow2.f36728a = null;
                    arrayRow2.f36731d.clear();
                    for (int i6 = 0; i6 < arrayRow.f36731d.mo15665a(); i6++) {
                        arrayRow2.f36731d.mo15669e(arrayRow.f36731d.mo15666b(i6), arrayRow.f36731d.mo15668d(i6), true);
                    }
                    m15706s(this.f36754r);
                    if (solverVariableM15688a.f36768e == -1) {
                        if (arrayRow.f36728a == solverVariableM15688a && (solverVariableM15684i = arrayRow.m15684i(null, solverVariableM15688a)) != null) {
                            arrayRow.m15685j(solverVariableM15684i);
                        }
                        if (!arrayRow.f36732e) {
                            arrayRow.f36728a.m15717e(this, arrayRow);
                        }
                        this.f36751o.f36734b.m15710b(arrayRow);
                        this.f36749m--;
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            SolverVariable solverVariable4 = arrayRow.f36728a;
            if (solverVariable4 == null || (solverVariable4.f36774k != aVar && arrayRow.f36729b < 0.0f)) {
                z4 = false;
            }
            if (!z4) {
                return;
            } else {
                z = z3;
            }
        }
        if (z) {
            return;
        }
        m15696i(arrayRow);
    }

    /* JADX INFO: renamed from: d */
    public ArrayRow m15691d(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (i2 == 8 && solverVariable2.f36771h && solverVariable.f36768e == -1) {
            solverVariable.m15716d(this, solverVariable2.f36770g + i);
            return null;
        }
        ArrayRow arrayRowM15700m = m15700m();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            arrayRowM15700m.f36729b = i;
        }
        if (z) {
            arrayRowM15700m.f36731d.mo15673i(solverVariable, 1.0f);
            arrayRowM15700m.f36731d.mo15673i(solverVariable2, -1.0f);
        } else {
            arrayRowM15700m.f36731d.mo15673i(solverVariable, -1.0f);
            arrayRowM15700m.f36731d.mo15673i(solverVariable2, 1.0f);
        }
        if (i2 != 8) {
            arrayRowM15700m.m15678c(this, i2);
        }
        m15690c(arrayRowM15700m);
        return arrayRowM15700m;
    }

    /* JADX INFO: renamed from: e */
    public void m15692e(SolverVariable solverVariable, int i) {
        int i2 = solverVariable.f36768e;
        if (i2 == -1) {
            solverVariable.m15716d(this, i);
            for (int i3 = 0; i3 < this.f36741e + 1; i3++) {
                SolverVariable solverVariable2 = this.f36751o.f36736d[i3];
            }
            return;
        }
        if (i2 == -1) {
            ArrayRow arrayRowM15700m = m15700m();
            arrayRowM15700m.f36728a = solverVariable;
            float f = i;
            solverVariable.f36770g = f;
            arrayRowM15700m.f36729b = f;
            arrayRowM15700m.f36732e = true;
            m15690c(arrayRowM15700m);
            return;
        }
        ArrayRow arrayRow = this.f36745i[i2];
        if (arrayRow.f36732e) {
            arrayRow.f36729b = i;
            return;
        }
        if (arrayRow.f36731d.mo15665a() == 0) {
            arrayRow.f36732e = true;
            arrayRow.f36729b = i;
            return;
        }
        ArrayRow arrayRowM15700m2 = m15700m();
        if (i < 0) {
            arrayRowM15700m2.f36729b = i * (-1);
            arrayRowM15700m2.f36731d.mo15673i(solverVariable, 1.0f);
        } else {
            arrayRowM15700m2.f36729b = i;
            arrayRowM15700m2.f36731d.mo15673i(solverVariable, -1.0f);
        }
        m15690c(arrayRowM15700m2);
    }

    /* JADX INFO: renamed from: f */
    public void m15693f(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        ArrayRow arrayRowM15700m = m15700m();
        SolverVariable solverVariableM15701n = m15701n();
        solverVariableM15701n.f36769f = 0;
        arrayRowM15700m.m15680e(solverVariable, solverVariable2, solverVariableM15701n, i);
        if (i2 != 8) {
            arrayRowM15700m.f36731d.mo15673i(m15698k(i2, null), (int) (arrayRowM15700m.f36731d.mo15670f(solverVariableM15701n) * (-1.0f)));
        }
        m15690c(arrayRowM15700m);
    }

    /* JADX INFO: renamed from: g */
    public void m15694g(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        ArrayRow arrayRowM15700m = m15700m();
        SolverVariable solverVariableM15701n = m15701n();
        solverVariableM15701n.f36769f = 0;
        arrayRowM15700m.m15681f(solverVariable, solverVariable2, solverVariableM15701n, i);
        if (i2 != 8) {
            arrayRowM15700m.f36731d.mo15673i(m15698k(i2, null), (int) (arrayRowM15700m.f36731d.mo15670f(solverVariableM15701n) * (-1.0f)));
        }
        m15690c(arrayRowM15700m);
    }

    /* JADX INFO: renamed from: h */
    public void m15695h(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f, int i) {
        ArrayRow arrayRowM15700m = m15700m();
        arrayRowM15700m.m15679d(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i != 8) {
            arrayRowM15700m.m15678c(this, i);
        }
        m15690c(arrayRowM15700m);
    }

    /* JADX INFO: renamed from: i */
    public final void m15696i(ArrayRow arrayRow) {
        int i;
        if (arrayRow.f36732e) {
            arrayRow.f36728a.m15716d(this, arrayRow.f36729b);
        } else {
            ArrayRow[] arrayRowArr = this.f36745i;
            int i2 = this.f36749m;
            arrayRowArr[i2] = arrayRow;
            SolverVariable solverVariable = arrayRow.f36728a;
            solverVariable.f36768e = i2;
            this.f36749m = i2 + 1;
            solverVariable.m15717e(this, arrayRow);
        }
        if (this.f36740d) {
            int i3 = 0;
            while (i3 < this.f36749m) {
                if (this.f36745i[i3] == null) {
                    System.out.println("WTF");
                }
                ArrayRow[] arrayRowArr2 = this.f36745i;
                if (arrayRowArr2[i3] != null && arrayRowArr2[i3].f36732e) {
                    ArrayRow arrayRow2 = arrayRowArr2[i3];
                    arrayRow2.f36728a.m15716d(this, arrayRow2.f36729b);
                    this.f36751o.f36734b.m15710b(arrayRow2);
                    this.f36745i[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f36749m;
                        if (i4 >= i) {
                            break;
                        }
                        ArrayRow[] arrayRowArr3 = this.f36745i;
                        int i6 = i4 - 1;
                        arrayRowArr3[i6] = arrayRowArr3[i4];
                        if (arrayRowArr3[i6].f36728a.f36768e == i4) {
                            arrayRowArr3[i6].f36728a.f36768e = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f36745i[i5] = null;
                    }
                    this.f36749m = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f36740d = false;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m15697j() {
        for (int i = 0; i < this.f36749m; i++) {
            ArrayRow arrayRow = this.f36745i[i];
            arrayRow.f36728a.f36770g = arrayRow.f36729b;
        }
    }

    /* JADX INFO: renamed from: k */
    public SolverVariable m15698k(int i, String str) {
        if (this.f36748l + 1 >= this.f36744h) {
            m15703p();
        }
        SolverVariable solverVariableM15688a = m15688a(SolverVariable.a.ERROR, str);
        int i2 = this.f36741e + 1;
        this.f36741e = i2;
        this.f36748l++;
        solverVariableM15688a.f36767d = i2;
        solverVariableM15688a.f36769f = i;
        this.f36751o.f36736d[i2] = solverVariableM15688a;
        this.f36742f.mo15676a(solverVariableM15688a);
        return solverVariableM15688a;
    }

    /* JADX INFO: renamed from: l */
    public SolverVariable m15699l(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f36748l + 1 >= this.f36744h) {
            m15703p();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.f36817i;
            if (solverVariable == null) {
                constraintAnchor.m15735k();
                solverVariable = constraintAnchor.f36817i;
            }
            int i = solverVariable.f36767d;
            if (i == -1 || i > this.f36741e || this.f36751o.f36736d[i] == null) {
                if (i != -1) {
                    solverVariable.m15715c();
                }
                int i2 = this.f36741e + 1;
                this.f36741e = i2;
                this.f36748l++;
                solverVariable.f36767d = i2;
                solverVariable.f36774k = SolverVariable.a.UNRESTRICTED;
                this.f36751o.f36736d[i2] = solverVariable;
            }
        }
        return solverVariable;
    }

    /* JADX INFO: renamed from: m */
    public ArrayRow m15700m() {
        ArrayRow arrayRowM15709a = this.f36751o.f36734b.m15709a();
        if (arrayRowM15709a == null) {
            arrayRowM15709a = new ArrayRow(this.f36751o);
            f36739c++;
        } else {
            arrayRowM15709a.f36728a = null;
            arrayRowM15709a.f36731d.clear();
            arrayRowM15709a.f36729b = 0.0f;
            arrayRowM15709a.f36732e = false;
        }
        SolverVariable.f36764a++;
        return arrayRowM15709a;
    }

    /* JADX INFO: renamed from: n */
    public SolverVariable m15701n() {
        if (this.f36748l + 1 >= this.f36744h) {
            m15703p();
        }
        SolverVariable solverVariableM15688a = m15688a(SolverVariable.a.SLACK, null);
        int i = this.f36741e + 1;
        this.f36741e = i;
        this.f36748l++;
        solverVariableM15688a.f36767d = i;
        this.f36751o.f36736d[i] = solverVariableM15688a;
        return solverVariableM15688a;
    }

    /* JADX INFO: renamed from: o */
    public int m15702o(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).f36817i;
        if (solverVariable != null) {
            return (int) (solverVariable.f36770g + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public final void m15703p() {
        int i = this.f36743g * 2;
        this.f36743g = i;
        this.f36745i = (ArrayRow[]) Arrays.copyOf(this.f36745i, i);
        Cache3 cache3 = this.f36751o;
        cache3.f36736d = (SolverVariable[]) Arrays.copyOf(cache3.f36736d, this.f36743g);
        int i2 = this.f36743g;
        this.f36747k = new boolean[i2];
        this.f36744h = i2;
        this.f36750n = i2;
    }

    /* JADX INFO: renamed from: q */
    public void m15704q() throws Exception {
        if (this.f36742f.isEmpty()) {
            m15697j();
            return;
        }
        if (!this.f36746j) {
            m15705r(this.f36742f);
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= this.f36749m) {
                z = true;
                break;
            } else if (!this.f36745i[i].f36732e) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            m15697j();
        } else {
            m15705r(this.f36742f);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m15705r(a aVar) throws Exception {
        float f;
        int i;
        boolean z;
        SolverVariable.a aVar2 = SolverVariable.a.UNRESTRICTED;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            i = 1;
            if (i2 >= this.f36749m) {
                z = false;
                break;
            }
            ArrayRow[] arrayRowArr = this.f36745i;
            if (arrayRowArr[i2].f36728a.f36774k != aVar2 && arrayRowArr[i2].f36729b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f2 = Float.MAX_VALUE;
                int i4 = 0;
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                while (i4 < this.f36749m) {
                    ArrayRow arrayRow = this.f36745i[i4];
                    if (arrayRow.f36728a.f36774k != aVar2 && !arrayRow.f36732e && arrayRow.f36729b < f) {
                        int iMo15665a = arrayRow.f36731d.mo15665a();
                        int i8 = 0;
                        while (i8 < iMo15665a) {
                            SolverVariable solverVariableMo15666b = arrayRow.f36731d.mo15666b(i8);
                            float fMo15670f = arrayRow.f36731d.mo15670f(solverVariableMo15666b);
                            if (fMo15670f > f) {
                                for (int i9 = 0; i9 < 9; i9++) {
                                    float f3 = solverVariableMo15666b.f36772i[i9] / fMo15670f;
                                    if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                        i6 = solverVariableMo15666b.f36767d;
                                        i7 = i9;
                                        f2 = f3;
                                        i5 = i4;
                                    }
                                }
                            }
                            i8++;
                            f = 0.0f;
                        }
                    }
                    i4++;
                    f = 0.0f;
                }
                if (i5 != -1) {
                    ArrayRow arrayRow2 = this.f36745i[i5];
                    arrayRow2.f36728a.f36768e = -1;
                    arrayRow2.m15685j(this.f36751o.f36736d[i6]);
                    SolverVariable solverVariable = arrayRow2.f36728a;
                    solverVariable.f36768e = i5;
                    solverVariable.m15717e(this, arrayRow2);
                } else {
                    z2 = true;
                }
                if (i3 > this.f36748l / 2) {
                    z2 = true;
                }
                f = 0.0f;
                i = 1;
            }
        }
        m15706s(aVar);
        m15697j();
    }

    /* JADX INFO: renamed from: s */
    public final int m15706s(a aVar) {
        for (int i = 0; i < this.f36748l; i++) {
            this.f36747k[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f36748l * 2) {
                return i2;
            }
            SolverVariable solverVariable = ((ArrayRow) aVar).f36728a;
            if (solverVariable != null) {
                this.f36747k[solverVariable.f36767d] = true;
            }
            SolverVariable solverVariableMo15677b = aVar.mo15677b(this, this.f36747k);
            if (solverVariableMo15677b != null) {
                boolean[] zArr = this.f36747k;
                int i3 = solverVariableMo15677b.f36767d;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (solverVariableMo15677b != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f36749m; i5++) {
                    ArrayRow arrayRow = this.f36745i[i5];
                    if (arrayRow.f36728a.f36774k != SolverVariable.a.UNRESTRICTED && !arrayRow.f36732e && arrayRow.f36731d.mo15671g(solverVariableMo15677b)) {
                        float fMo15670f = arrayRow.f36731d.mo15670f(solverVariableMo15677b);
                        if (fMo15670f < 0.0f) {
                            float f2 = (-arrayRow.f36729b) / fMo15670f;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    ArrayRow arrayRow2 = this.f36745i[i4];
                    arrayRow2.f36728a.f36768e = -1;
                    arrayRow2.m15685j(solverVariableMo15677b);
                    SolverVariable solverVariable2 = arrayRow2.f36728a;
                    solverVariable2.f36768e = i4;
                    solverVariable2.m15717e(this, arrayRow2);
                }
            } else {
                z = true;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: t */
    public final void m15707t() {
        for (int i = 0; i < this.f36749m; i++) {
            ArrayRow arrayRow = this.f36745i[i];
            if (arrayRow != null) {
                this.f36751o.f36734b.m15710b(arrayRow);
            }
            this.f36745i[i] = null;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m15708u() {
        Cache3 cache3;
        int i = 0;
        while (true) {
            cache3 = this.f36751o;
            SolverVariable[] solverVariableArr = cache3.f36736d;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.m15715c();
            }
            i++;
        }
        Pools<SolverVariable> pools = cache3.f36735c;
        SolverVariable[] solverVariableArr2 = this.f36752p;
        int length = this.f36753q;
        Objects.requireNonNull(pools);
        if (length > solverVariableArr2.length) {
            length = solverVariableArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            SolverVariable solverVariable2 = solverVariableArr2[i2];
            int i3 = pools.f36756b;
            Object[] objArr = pools.f36755a;
            if (i3 < objArr.length) {
                objArr[i3] = solverVariable2;
                pools.f36756b = i3 + 1;
            }
        }
        this.f36753q = 0;
        Arrays.fill(this.f36751o.f36736d, (Object) null);
        this.f36741e = 0;
        this.f36742f.clear();
        this.f36748l = 1;
        for (int i4 = 0; i4 < this.f36749m; i4++) {
            ArrayRow[] arrayRowArr = this.f36745i;
            if (arrayRowArr[i4] != null) {
                Objects.requireNonNull(arrayRowArr[i4]);
            }
        }
        m15707t();
        this.f36749m = 0;
        this.f36754r = new ArrayRow(this.f36751o);
    }
}
