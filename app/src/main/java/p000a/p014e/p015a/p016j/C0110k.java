package p000a.p014e.p015a.p016j;

/* renamed from: a.e.a.j.k */
/* loaded from: classes.dex */
public class C0110k {

    /* renamed from: a */
    static boolean[] f509a;

    static {
            r0 = 3
            boolean[] r0 = new boolean[r0]
            p000a.p014e.p015a.p016j.C0110k.f509a = r0
            return
    }

    /* renamed from: a */
    static void m3771a(int r16, p000a.p014e.p015a.p016j.C0102f r17) {
            r0 = r17
            r17.m3880I()
            a.e.a.j.e r1 = r0.f453s
            a.e.a.j.m r1 = r1.m3893d()
            a.e.a.j.e r2 = r0.f454t
            a.e.a.j.m r2 = r2.m3893d()
            a.e.a.j.e r3 = r0.f455u
            a.e.a.j.m r3 = r3.m3893d()
            a.e.a.j.e r4 = r0.f456v
            a.e.a.j.m r4 = r4.m3893d()
            r5 = 8
            r6 = r16 & 8
            r7 = 0
            r8 = 1
            if (r6 != r5) goto L_0x0027
            r6 = 1
            goto L_0x0028
        L_0x0027:
            r6 = 0
        L_0x0028:
            a.e.a.j.f$b[] r9 = r0.f402C
            r9 = r9[r7]
            a.e.a.j.f$b r10 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f465d
            if (r9 != r10) goto L_0x0038
            boolean r9 = m3770a(r0, r7)
            if (r9 == 0) goto L_0x0038
            r9 = 1
            goto L_0x0039
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r10 = r1.f515h
            r11 = 3
            r12 = 4
            r13 = 0
            r14 = -1
            r15 = 2
            if (r10 == r12) goto L_0x0181
            int r10 = r3.f515h
            if (r10 == r12) goto L_0x0181
            a.e.a.j.f$b[] r10 = r0.f402C
            r10 = r10[r7]
            a.e.a.j.f$b r7 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f463b
            if (r10 == r7) goto L_0x00d7
            if (r9 == 0) goto L_0x0058
            int r7 = r17.m3822r()
            if (r7 != r5) goto L_0x0058
            goto L_0x00d7
        L_0x0058:
            if (r9 == 0) goto L_0x0181
            int r7 = r17.m3820s()
            r1.m3760b(r8)
            r3.m3760b(r8)
            a.e.a.j.e r9 = r0.f453s
            a.e.a.j.e r9 = r9.f375d
            if (r9 != 0) goto L_0x0074
            a.e.a.j.e r9 = r0.f455u
            a.e.a.j.e r9 = r9.f375d
            if (r9 != 0) goto L_0x0074
            if (r6 == 0) goto L_0x00f8
            goto L_0x00eb
        L_0x0074:
            a.e.a.j.e r9 = r0.f453s
            a.e.a.j.e r9 = r9.f375d
            if (r9 == 0) goto L_0x0083
            a.e.a.j.e r9 = r0.f455u
            a.e.a.j.e r9 = r9.f375d
            if (r9 != 0) goto L_0x0083
            if (r6 == 0) goto L_0x00f8
            goto L_0x00eb
        L_0x0083:
            a.e.a.j.e r9 = r0.f453s
            a.e.a.j.e r9 = r9.f375d
            if (r9 != 0) goto L_0x0093
            a.e.a.j.e r9 = r0.f455u
            a.e.a.j.e r9 = r9.f375d
            if (r9 == 0) goto L_0x0093
            if (r6 == 0) goto L_0x013a
            goto L_0x012e
        L_0x0093:
            a.e.a.j.e r9 = r0.f453s
            a.e.a.j.e r9 = r9.f375d
            if (r9 == 0) goto L_0x0181
            a.e.a.j.e r9 = r0.f455u
            a.e.a.j.e r9 = r9.f375d
            if (r9 == 0) goto L_0x0181
            if (r6 == 0) goto L_0x00af
            a.e.a.j.n r9 = r17.m3832m()
            r9.m3752a(r1)
            a.e.a.j.n r9 = r17.m3832m()
            r9.m3752a(r3)
        L_0x00af:
            float r9 = r0.f406G
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x00c3
            r1.m3760b(r11)
            r3.m3760b(r11)
            r1.m3759b(r3, r13)
            r3.m3759b(r1, r13)
            goto L_0x0181
        L_0x00c3:
            r1.m3760b(r15)
            r3.m3760b(r15)
            int r9 = -r7
            float r9 = (float) r9
            r1.m3759b(r3, r9)
            float r9 = (float) r7
            r3.m3759b(r1, r9)
            r0.m3827o(r7)
            goto L_0x0181
        L_0x00d7:
            a.e.a.j.e r7 = r0.f453s
            a.e.a.j.e r7 = r7.f375d
            if (r7 != 0) goto L_0x00fd
            a.e.a.j.e r7 = r0.f455u
            a.e.a.j.e r7 = r7.f375d
            if (r7 != 0) goto L_0x00fd
            r1.m3760b(r8)
            r3.m3760b(r8)
            if (r6 == 0) goto L_0x00f4
        L_0x00eb:
            a.e.a.j.n r7 = r17.m3832m()
            r3.m3761a(r1, r8, r7)
            goto L_0x0181
        L_0x00f4:
            int r7 = r17.m3820s()
        L_0x00f8:
            r3.m3762a(r1, r7)
            goto L_0x0181
        L_0x00fd:
            a.e.a.j.e r7 = r0.f453s
            a.e.a.j.e r7 = r7.f375d
            if (r7 == 0) goto L_0x0112
            a.e.a.j.e r7 = r0.f455u
            a.e.a.j.e r7 = r7.f375d
            if (r7 != 0) goto L_0x0112
            r1.m3760b(r8)
            r3.m3760b(r8)
            if (r6 == 0) goto L_0x00f4
            goto L_0x00eb
        L_0x0112:
            a.e.a.j.e r7 = r0.f453s
            a.e.a.j.e r7 = r7.f375d
            if (r7 != 0) goto L_0x013f
            a.e.a.j.e r7 = r0.f455u
            a.e.a.j.e r7 = r7.f375d
            if (r7 == 0) goto L_0x013f
            r1.m3760b(r8)
            r3.m3760b(r8)
            int r7 = r17.m3820s()
            int r7 = -r7
            r1.m3762a(r3, r7)
            if (r6 == 0) goto L_0x0136
        L_0x012e:
            a.e.a.j.n r7 = r17.m3832m()
            r1.m3761a(r3, r14, r7)
            goto L_0x0181
        L_0x0136:
            int r7 = r17.m3820s()
        L_0x013a:
            int r7 = -r7
            r1.m3762a(r3, r7)
            goto L_0x0181
        L_0x013f:
            a.e.a.j.e r7 = r0.f453s
            a.e.a.j.e r7 = r7.f375d
            if (r7 == 0) goto L_0x0181
            a.e.a.j.e r7 = r0.f455u
            a.e.a.j.e r7 = r7.f375d
            if (r7 == 0) goto L_0x0181
            r1.m3760b(r15)
            r3.m3760b(r15)
            if (r6 == 0) goto L_0x0170
            a.e.a.j.n r7 = r17.m3832m()
            r7.m3752a(r1)
            a.e.a.j.n r7 = r17.m3832m()
            r7.m3752a(r3)
            a.e.a.j.n r7 = r17.m3832m()
            r1.m3758b(r3, r14, r7)
            a.e.a.j.n r7 = r17.m3832m()
            r3.m3758b(r1, r8, r7)
            goto L_0x0181
        L_0x0170:
            int r7 = r17.m3820s()
            int r7 = -r7
            float r7 = (float) r7
            r1.m3759b(r3, r7)
            int r7 = r17.m3820s()
            float r7 = (float) r7
            r3.m3759b(r1, r7)
        L_0x0181:
            a.e.a.j.f$b[] r1 = r0.f402C
            r1 = r1[r8]
            a.e.a.j.f$b r3 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f465d
            if (r1 != r3) goto L_0x0191
            boolean r1 = m3770a(r0, r8)
            if (r1 == 0) goto L_0x0191
            r1 = 1
            goto L_0x0192
        L_0x0191:
            r1 = 0
        L_0x0192:
            int r3 = r2.f515h
            if (r3 == r12) goto L_0x0329
            int r3 = r4.f515h
            if (r3 == r12) goto L_0x0329
            a.e.a.j.f$b[] r3 = r0.f402C
            r3 = r3[r8]
            a.e.a.j.f$b r7 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f463b
            if (r3 == r7) goto L_0x0247
            if (r1 == 0) goto L_0x01ac
            int r3 = r17.m3822r()
            if (r3 != r5) goto L_0x01ac
            goto L_0x0247
        L_0x01ac:
            if (r1 == 0) goto L_0x0329
            int r1 = r17.m3840i()
            r2.m3760b(r8)
            r4.m3760b(r8)
            a.e.a.j.e r3 = r0.f454t
            a.e.a.j.e r3 = r3.f375d
            if (r3 != 0) goto L_0x01d4
            a.e.a.j.e r3 = r0.f456v
            a.e.a.j.e r3 = r3.f375d
            if (r3 != 0) goto L_0x01d4
            if (r6 == 0) goto L_0x01cf
        L_0x01c6:
            a.e.a.j.n r0 = r17.m3834l()
            r4.m3761a(r2, r8, r0)
            goto L_0x0329
        L_0x01cf:
            r4.m3762a(r2, r1)
            goto L_0x0329
        L_0x01d4:
            a.e.a.j.e r3 = r0.f454t
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x01e3
            a.e.a.j.e r3 = r0.f456v
            a.e.a.j.e r3 = r3.f375d
            if (r3 != 0) goto L_0x01e3
            if (r6 == 0) goto L_0x01cf
            goto L_0x01c6
        L_0x01e3:
            a.e.a.j.e r3 = r0.f454t
            a.e.a.j.e r3 = r3.f375d
            if (r3 != 0) goto L_0x0200
            a.e.a.j.e r3 = r0.f456v
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x0200
            if (r6 == 0) goto L_0x01fa
            a.e.a.j.n r0 = r17.m3834l()
            r2.m3761a(r4, r14, r0)
            goto L_0x0329
        L_0x01fa:
            int r0 = -r1
            r2.m3762a(r4, r0)
            goto L_0x0329
        L_0x0200:
            a.e.a.j.e r3 = r0.f454t
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x0329
            a.e.a.j.e r3 = r0.f456v
            a.e.a.j.e r3 = r3.f375d
            if (r3 == 0) goto L_0x0329
            if (r6 == 0) goto L_0x021c
            a.e.a.j.n r3 = r17.m3834l()
            r3.m3752a(r2)
            a.e.a.j.n r3 = r17.m3832m()
            r3.m3752a(r4)
        L_0x021c:
            float r3 = r0.f406G
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x0230
            r2.m3760b(r11)
            r4.m3760b(r11)
            r2.m3759b(r4, r13)
            r4.m3759b(r2, r13)
            goto L_0x0329
        L_0x0230:
            r2.m3760b(r15)
            r4.m3760b(r15)
            int r3 = -r1
            float r3 = (float) r3
            r2.m3759b(r4, r3)
            float r3 = (float) r1
            r4.m3759b(r2, r3)
            r0.m3843g(r1)
            int r1 = r0.f416Q
            if (r1 <= 0) goto L_0x0329
            goto L_0x02ac
        L_0x0247:
            a.e.a.j.e r1 = r0.f454t
            a.e.a.j.e r1 = r1.f375d
            if (r1 != 0) goto L_0x0285
            a.e.a.j.e r1 = r0.f456v
            a.e.a.j.e r1 = r1.f375d
            if (r1 != 0) goto L_0x0285
            r2.m3760b(r8)
            r4.m3760b(r8)
            if (r6 == 0) goto L_0x0263
            a.e.a.j.n r1 = r17.m3834l()
            r4.m3761a(r2, r8, r1)
            goto L_0x026a
        L_0x0263:
            int r1 = r17.m3840i()
            r4.m3762a(r2, r1)
        L_0x026a:
            a.e.a.j.e r1 = r0.f457w
            a.e.a.j.e r3 = r1.f375d
            if (r3 == 0) goto L_0x0329
            a.e.a.j.m r1 = r1.m3893d()
            r1.m3760b(r8)
            a.e.a.j.e r1 = r0.f457w
            a.e.a.j.m r1 = r1.m3893d()
            int r0 = r0.f416Q
            int r0 = -r0
            r2.m3765a(r8, r1, r0)
            goto L_0x0329
        L_0x0285:
            a.e.a.j.e r1 = r0.f454t
            a.e.a.j.e r1 = r1.f375d
            if (r1 == 0) goto L_0x02b9
            a.e.a.j.e r1 = r0.f456v
            a.e.a.j.e r1 = r1.f375d
            if (r1 != 0) goto L_0x02b9
            r2.m3760b(r8)
            r4.m3760b(r8)
            if (r6 == 0) goto L_0x02a1
            a.e.a.j.n r1 = r17.m3834l()
            r4.m3761a(r2, r8, r1)
            goto L_0x02a8
        L_0x02a1:
            int r1 = r17.m3840i()
            r4.m3762a(r2, r1)
        L_0x02a8:
            int r1 = r0.f416Q
            if (r1 <= 0) goto L_0x0329
        L_0x02ac:
            a.e.a.j.e r1 = r0.f457w
            a.e.a.j.m r1 = r1.m3893d()
            int r0 = r0.f416Q
            r1.m3765a(r8, r2, r0)
            goto L_0x0329
        L_0x02b9:
            a.e.a.j.e r1 = r0.f454t
            a.e.a.j.e r1 = r1.f375d
            if (r1 != 0) goto L_0x02e2
            a.e.a.j.e r1 = r0.f456v
            a.e.a.j.e r1 = r1.f375d
            if (r1 == 0) goto L_0x02e2
            r2.m3760b(r8)
            r4.m3760b(r8)
            if (r6 == 0) goto L_0x02d5
            a.e.a.j.n r1 = r17.m3834l()
            r2.m3761a(r4, r14, r1)
            goto L_0x02dd
        L_0x02d5:
            int r1 = r17.m3840i()
            int r1 = -r1
            r2.m3762a(r4, r1)
        L_0x02dd:
            int r1 = r0.f416Q
            if (r1 <= 0) goto L_0x0329
            goto L_0x02ac
        L_0x02e2:
            a.e.a.j.e r1 = r0.f454t
            a.e.a.j.e r1 = r1.f375d
            if (r1 == 0) goto L_0x0329
            a.e.a.j.e r1 = r0.f456v
            a.e.a.j.e r1 = r1.f375d
            if (r1 == 0) goto L_0x0329
            r2.m3760b(r15)
            r4.m3760b(r15)
            if (r6 == 0) goto L_0x0313
            a.e.a.j.n r1 = r17.m3834l()
            r2.m3758b(r4, r14, r1)
            a.e.a.j.n r1 = r17.m3834l()
            r4.m3758b(r2, r8, r1)
            a.e.a.j.n r1 = r17.m3834l()
            r1.m3752a(r2)
            a.e.a.j.n r1 = r17.m3832m()
            r1.m3752a(r4)
            goto L_0x0324
        L_0x0313:
            int r1 = r17.m3840i()
            int r1 = -r1
            float r1 = (float) r1
            r2.m3759b(r4, r1)
            int r1 = r17.m3840i()
            float r1 = (float) r1
            r4.m3759b(r2, r1)
        L_0x0324:
            int r1 = r0.f416Q
            if (r1 <= 0) goto L_0x0329
            goto L_0x02ac
        L_0x0329:
            return
    }

    /* renamed from: a */
    static void m3769a(p000a.p014e.p015a.p016j.C0102f r4, int r5, int r6) {
            int r0 = r5 * 2
            int r1 = r0 + 1
            a.e.a.j.e[] r2 = r4.f400A
            r2 = r2[r0]
            a.e.a.j.m r2 = r2.m3893d()
            a.e.a.j.f r3 = r4.m3836k()
            a.e.a.j.e r3 = r3.f453s
            a.e.a.j.m r3 = r3.m3893d()
            r2.f513f = r3
            a.e.a.j.e[] r2 = r4.f400A
            r2 = r2[r0]
            a.e.a.j.m r2 = r2.m3893d()
            float r6 = (float) r6
            r2.f514g = r6
            a.e.a.j.e[] r6 = r4.f400A
            r6 = r6[r0]
            a.e.a.j.m r6 = r6.m3893d()
            r2 = 1
            r6.f523b = r2
            a.e.a.j.e[] r6 = r4.f400A
            r6 = r6[r1]
            a.e.a.j.m r6 = r6.m3893d()
            a.e.a.j.e[] r3 = r4.f400A
            r0 = r3[r0]
            a.e.a.j.m r0 = r0.m3893d()
            r6.f513f = r0
            a.e.a.j.e[] r6 = r4.f400A
            r6 = r6[r1]
            a.e.a.j.m r6 = r6.m3893d()
            int r5 = r4.m3851d(r5)
            float r5 = (float) r5
            r6.f514g = r5
            a.e.a.j.e[] r4 = r4.f400A
            r4 = r4[r1]
            a.e.a.j.m r4 = r4.m3893d()
            r4.f523b = r2
            return
    }

    /* renamed from: a */
    static void m3767a(p000a.p014e.p015a.p016j.C0105g r5, p000a.p014e.p015a.C0086e r6, p000a.p014e.p015a.p016j.C0102f r7) {
            a.e.a.j.f$b[] r0 = r5.f402C
            r1 = 0
            r0 = r0[r1]
            a.e.a.j.f$b r2 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f464c
            r3 = 2
            if (r0 == r2) goto L_0x0042
            a.e.a.j.f$b[] r0 = r7.f402C
            r0 = r0[r1]
            a.e.a.j.f$b r1 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f466e
            if (r0 != r1) goto L_0x0042
            a.e.a.j.e r0 = r7.f453s
            int r0 = r0.f376e
            int r1 = r5.m3820s()
            a.e.a.j.e r2 = r7.f455u
            int r2 = r2.f376e
            int r1 = r1 - r2
            a.e.a.j.e r2 = r7.f453s
            a.e.a.i r4 = r6.m3949a(r2)
            r2.f380i = r4
            a.e.a.j.e r2 = r7.f455u
            a.e.a.i r4 = r6.m3949a(r2)
            r2.f380i = r4
            a.e.a.j.e r2 = r7.f453s
            a.e.a.i r2 = r2.f380i
            r6.m3955a(r2, r0)
            a.e.a.j.e r2 = r7.f455u
            a.e.a.i r2 = r2.f380i
            r6.m3955a(r2, r1)
            r7.f426a = r3
            r7.m3877a(r0, r1)
        L_0x0042:
            a.e.a.j.f$b[] r0 = r5.f402C
            r1 = 1
            r0 = r0[r1]
            a.e.a.j.f$b r2 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f464c
            if (r0 == r2) goto L_0x00a1
            a.e.a.j.f$b[] r0 = r7.f402C
            r0 = r0[r1]
            a.e.a.j.f$b r1 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f466e
            if (r0 != r1) goto L_0x00a1
            a.e.a.j.e r0 = r7.f454t
            int r0 = r0.f376e
            int r5 = r5.m3840i()
            a.e.a.j.e r1 = r7.f456v
            int r1 = r1.f376e
            int r5 = r5 - r1
            a.e.a.j.e r1 = r7.f454t
            a.e.a.i r2 = r6.m3949a(r1)
            r1.f380i = r2
            a.e.a.j.e r1 = r7.f456v
            a.e.a.i r2 = r6.m3949a(r1)
            r1.f380i = r2
            a.e.a.j.e r1 = r7.f454t
            a.e.a.i r1 = r1.f380i
            r6.m3955a(r1, r0)
            a.e.a.j.e r1 = r7.f456v
            a.e.a.i r1 = r1.f380i
            r6.m3955a(r1, r5)
            int r1 = r7.f416Q
            if (r1 > 0) goto L_0x008a
            int r1 = r7.m3822r()
            r2 = 8
            if (r1 != r2) goto L_0x009c
        L_0x008a:
            a.e.a.j.e r1 = r7.f457w
            a.e.a.i r2 = r6.m3949a(r1)
            r1.f380i = r2
            a.e.a.j.e r1 = r7.f457w
            a.e.a.i r1 = r1.f380i
            int r2 = r7.f416Q
            int r2 = r2 + r0
            r6.m3955a(r1, r2)
        L_0x009c:
            r7.f428b = r3
            r7.m3847e(r0, r5)
        L_0x00a1:
            return
    }

    /* renamed from: a */
    private static boolean m3770a(p000a.p014e.p015a.p016j.C0102f r5, int r6) {
            a.e.a.j.f$b[] r0 = r5.f402C
            r1 = r0[r6]
            a.e.a.j.f$b r2 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f465d
            r3 = 0
            if (r1 == r2) goto L_0x000a
            return r3
        L_0x000a:
            float r1 = r5.f406G
            r2 = 0
            r4 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x001b
            if (r6 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            r5 = r0[r4]
            a.e.a.j.f$b r6 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f465d
            return r3
        L_0x001b:
            if (r6 != 0) goto L_0x002b
            int r6 = r5.f434e
            if (r6 == 0) goto L_0x0022
            return r3
        L_0x0022:
            int r6 = r5.f440h
            if (r6 != 0) goto L_0x002a
            int r5 = r5.f442i
            if (r5 == 0) goto L_0x0039
        L_0x002a:
            return r3
        L_0x002b:
            int r6 = r5.f436f
            if (r6 == 0) goto L_0x0030
            return r3
        L_0x0030:
            int r6 = r5.f445k
            if (r6 != 0) goto L_0x003a
            int r5 = r5.f446l
            if (r5 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            return r4
        L_0x003a:
            return r3
    }

    /* renamed from: a */
    static boolean m3768a(p000a.p014e.p015a.p016j.C0105g r24, p000a.p014e.p015a.C0086e r25, int r26, int r27, p000a.p014e.p015a.p016j.C0096d r28) {
            r0 = r25
            r1 = r26
            r2 = r28
            a.e.a.j.f r3 = r2.f355a
            a.e.a.j.f r4 = r2.f357c
            a.e.a.j.f r5 = r2.f356b
            a.e.a.j.f r6 = r2.f358d
            a.e.a.j.f r7 = r2.f359e
            float r8 = r2.f365k
            a.e.a.j.f r9 = r2.f360f
            a.e.a.j.f r2 = r2.f361g
            r9 = r24
            a.e.a.j.f$b[] r2 = r9.f402C
            r2 = r2[r1]
            a.e.a.j.f$b r9 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f464c
            r2 = 2
            r10 = 1
            if (r1 != 0) goto L_0x0038
            int r11 = r7.f435e0
            if (r11 != 0) goto L_0x0028
            r11 = 1
            goto L_0x0029
        L_0x0028:
            r11 = 0
        L_0x0029:
            int r12 = r7.f435e0
            if (r12 != r10) goto L_0x002f
            r12 = 1
            goto L_0x0030
        L_0x002f:
            r12 = 0
        L_0x0030:
            int r7 = r7.f435e0
            if (r7 != r2) goto L_0x0036
        L_0x0034:
            r2 = 1
            goto L_0x004b
        L_0x0036:
            r2 = 0
            goto L_0x004b
        L_0x0038:
            int r11 = r7.f437f0
            if (r11 != 0) goto L_0x003e
            r11 = 1
            goto L_0x003f
        L_0x003e:
            r11 = 0
        L_0x003f:
            int r12 = r7.f437f0
            if (r12 != r10) goto L_0x0045
            r12 = 1
            goto L_0x0046
        L_0x0045:
            r12 = 0
        L_0x0046:
            int r7 = r7.f437f0
            if (r7 != r2) goto L_0x0036
            goto L_0x0034
        L_0x004b:
            r14 = r3
            r10 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0053:
            r7 = 8
            if (r13 != 0) goto L_0x010c
            int r9 = r14.m3822r()
            if (r9 == r7) goto L_0x00a1
            int r15 = r15 + 1
            if (r1 != 0) goto L_0x0066
            int r9 = r14.m3820s()
            goto L_0x006a
        L_0x0066:
            int r9 = r14.m3840i()
        L_0x006a:
            float r9 = (float) r9
            float r16 = r16 + r9
            if (r14 == r5) goto L_0x007a
            a.e.a.j.e[] r9 = r14.f400A
            r9 = r9[r27]
            int r9 = r9.m3895b()
            float r9 = (float) r9
            float r16 = r16 + r9
        L_0x007a:
            if (r14 == r6) goto L_0x0089
            a.e.a.j.e[] r9 = r14.f400A
            int r19 = r27 + 1
            r9 = r9[r19]
            int r9 = r9.m3895b()
            float r9 = (float) r9
            float r16 = r16 + r9
        L_0x0089:
            a.e.a.j.e[] r9 = r14.f400A
            r9 = r9[r27]
            int r9 = r9.m3895b()
            float r9 = (float) r9
            float r17 = r17 + r9
            a.e.a.j.e[] r9 = r14.f400A
            int r19 = r27 + 1
            r9 = r9[r19]
            int r9 = r9.m3895b()
            float r9 = (float) r9
            float r17 = r17 + r9
        L_0x00a1:
            a.e.a.j.e[] r9 = r14.f400A
            r9 = r9[r27]
            int r9 = r14.m3822r()
            if (r9 == r7) goto L_0x00df
            a.e.a.j.f$b[] r7 = r14.f402C
            r7 = r7[r1]
            a.e.a.j.f$b r9 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f465d
            if (r7 != r9) goto L_0x00df
            int r10 = r10 + 1
            if (r1 != 0) goto L_0x00c7
            int r7 = r14.f434e
            if (r7 == 0) goto L_0x00bd
            r7 = 0
            return r7
        L_0x00bd:
            r7 = 0
            int r9 = r14.f440h
            if (r9 != 0) goto L_0x00c6
            int r9 = r14.f442i
            if (r9 == 0) goto L_0x00d6
        L_0x00c6:
            return r7
        L_0x00c7:
            r7 = 0
            int r9 = r14.f436f
            if (r9 == 0) goto L_0x00cd
            return r7
        L_0x00cd:
            int r9 = r14.f445k
            if (r9 != 0) goto L_0x00de
            int r9 = r14.f446l
            if (r9 == 0) goto L_0x00d6
            goto L_0x00de
        L_0x00d6:
            float r9 = r14.f406G
            r18 = 0
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 == 0) goto L_0x00df
        L_0x00de:
            return r7
        L_0x00df:
            a.e.a.j.e[] r7 = r14.f400A
            int r9 = r27 + 1
            r7 = r7[r9]
            a.e.a.j.e r7 = r7.f375d
            if (r7 == 0) goto L_0x0101
            a.e.a.j.f r7 = r7.f373b
            a.e.a.j.e[] r9 = r7.f400A
            r20 = r7
            r7 = r9[r27]
            a.e.a.j.e r7 = r7.f375d
            if (r7 == 0) goto L_0x0101
            r7 = r9[r27]
            a.e.a.j.e r7 = r7.f375d
            a.e.a.j.f r7 = r7.f373b
            if (r7 == r14) goto L_0x00fe
            goto L_0x0101
        L_0x00fe:
            r19 = r20
            goto L_0x0103
        L_0x0101:
            r19 = 0
        L_0x0103:
            if (r19 == 0) goto L_0x0109
            r14 = r19
            goto L_0x0053
        L_0x0109:
            r13 = 1
            goto L_0x0053
        L_0x010c:
            a.e.a.j.e[] r9 = r3.f400A
            r9 = r9[r27]
            a.e.a.j.m r9 = r9.m3893d()
            a.e.a.j.e[] r13 = r4.f400A
            int r19 = r27 + 1
            r13 = r13[r19]
            a.e.a.j.m r13 = r13.m3893d()
            a.e.a.j.m r7 = r9.f511d
            if (r7 == 0) goto L_0x0382
            r21 = r3
            a.e.a.j.m r3 = r13.f511d
            if (r3 != 0) goto L_0x012a
            goto L_0x0382
        L_0x012a:
            int r7 = r7.f523b
            r0 = 1
            if (r7 != r0) goto L_0x0380
            int r3 = r3.f523b
            if (r3 == r0) goto L_0x0135
            goto L_0x0380
        L_0x0135:
            if (r10 <= 0) goto L_0x013b
            if (r10 == r15) goto L_0x013b
            r0 = 0
            return r0
        L_0x013b:
            if (r2 != 0) goto L_0x0144
            if (r11 != 0) goto L_0x0144
            if (r12 == 0) goto L_0x0142
            goto L_0x0144
        L_0x0142:
            r7 = 0
            goto L_0x015d
        L_0x0144:
            if (r5 == 0) goto L_0x0150
            a.e.a.j.e[] r0 = r5.f400A
            r0 = r0[r27]
            int r0 = r0.m3895b()
            float r7 = (float) r0
            goto L_0x0151
        L_0x0150:
            r7 = 0
        L_0x0151:
            if (r6 == 0) goto L_0x015d
            a.e.a.j.e[] r0 = r6.f400A
            r0 = r0[r19]
            int r0 = r0.m3895b()
            float r0 = (float) r0
            float r7 = r7 + r0
        L_0x015d:
            a.e.a.j.m r0 = r9.f511d
            float r0 = r0.f514g
            a.e.a.j.m r3 = r13.f511d
            float r3 = r3.f514g
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x016b
            float r3 = r3 - r0
            goto L_0x016d
        L_0x016b:
            float r3 = r0 - r3
        L_0x016d:
            float r3 = r3 - r16
            r22 = 1
            if (r10 <= 0) goto L_0x0223
            if (r10 != r15) goto L_0x0223
            a.e.a.j.f r2 = r14.m3836k()
            if (r2 == 0) goto L_0x0189
            a.e.a.j.f r2 = r14.m3836k()
            a.e.a.j.f$b[] r2 = r2.f402C
            r2 = r2[r1]
            a.e.a.j.f$b r5 = p000a.p014e.p015a.p016j.C0102f.EnumC0104b.f464c
            if (r2 != r5) goto L_0x0189
            r2 = 0
            return r2
        L_0x0189:
            float r3 = r3 + r16
            float r3 = r3 - r17
            r2 = r0
            r0 = r21
        L_0x0190:
            if (r0 == 0) goto L_0x0221
            a.e.a.f r5 = p000a.p014e.p015a.C0086e.f290q
            if (r5 == 0) goto L_0x01a8
            long r6 = r5.f332z
            long r6 = r6 - r22
            r5.f332z = r6
            long r6 = r5.f324r
            long r6 = r6 + r22
            r5.f324r = r6
            long r6 = r5.f330x
            long r6 = r6 + r22
            r5.f330x = r6
        L_0x01a8:
            a.e.a.j.f[] r5 = r0.f443i0
            r5 = r5[r1]
            if (r5 != 0) goto L_0x01b4
            if (r0 != r4) goto L_0x01b1
            goto L_0x01b4
        L_0x01b1:
            r13 = r25
            goto L_0x021e
        L_0x01b4:
            float r6 = (float) r10
            float r6 = r3 / r6
            r7 = 0
            int r11 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x01cd
            float[] r6 = r0.f439g0
            r7 = r6[r1]
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x01c8
            r7 = 0
            goto L_0x01ce
        L_0x01c8:
            r6 = r6[r1]
            float r6 = r6 * r3
            float r6 = r6 / r8
        L_0x01cd:
            r7 = r6
        L_0x01ce:
            int r6 = r0.m3822r()
            r11 = 8
            if (r6 != r11) goto L_0x01d7
            r7 = 0
        L_0x01d7:
            a.e.a.j.e[] r6 = r0.f400A
            r6 = r6[r27]
            int r6 = r6.m3895b()
            float r6 = (float) r6
            float r2 = r2 + r6
            a.e.a.j.e[] r6 = r0.f400A
            r6 = r6[r27]
            a.e.a.j.m r6 = r6.m3893d()
            a.e.a.j.m r11 = r9.f513f
            r6.m3763a(r11, r2)
            a.e.a.j.e[] r6 = r0.f400A
            r6 = r6[r19]
            a.e.a.j.m r6 = r6.m3893d()
            a.e.a.j.m r11 = r9.f513f
            float r2 = r2 + r7
            r6.m3763a(r11, r2)
            a.e.a.j.e[] r6 = r0.f400A
            r6 = r6[r27]
            a.e.a.j.m r6 = r6.m3893d()
            r13 = r25
            r6.m3764a(r13)
            a.e.a.j.e[] r6 = r0.f400A
            r6 = r6[r19]
            a.e.a.j.m r6 = r6.m3893d()
            r6.m3764a(r13)
            a.e.a.j.e[] r0 = r0.f400A
            r0 = r0[r19]
            int r0 = r0.m3895b()
            float r0 = (float) r0
            float r2 = r2 + r0
        L_0x021e:
            r0 = r5
            goto L_0x0190
        L_0x0221:
            r0 = 1
            return r0
        L_0x0223:
            r13 = r25
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x022d
            r2 = 1
            r11 = 0
            r12 = 0
        L_0x022d:
            if (r2 == 0) goto L_0x02ac
            float r3 = r3 - r7
            r2 = r21
            float r5 = r2.m3863b(r1)
            float r3 = r3 * r5
            float r0 = r0 + r3
        L_0x0239:
            if (r2 == 0) goto L_0x02b3
            a.e.a.f r3 = p000a.p014e.p015a.C0086e.f290q
            if (r3 == 0) goto L_0x0251
            long r5 = r3.f332z
            long r5 = r5 - r22
            r3.f332z = r5
            long r5 = r3.f324r
            long r5 = r5 + r22
            r3.f324r = r5
            long r5 = r3.f330x
            long r5 = r5 + r22
            r3.f330x = r5
        L_0x0251:
            a.e.a.j.f[] r3 = r2.f443i0
            r3 = r3[r1]
            if (r3 != 0) goto L_0x0259
            if (r2 != r4) goto L_0x02aa
        L_0x0259:
            if (r1 != 0) goto L_0x0260
            int r5 = r2.m3820s()
            goto L_0x0264
        L_0x0260:
            int r5 = r2.m3840i()
        L_0x0264:
            float r5 = (float) r5
            a.e.a.j.e[] r6 = r2.f400A
            r6 = r6[r27]
            int r6 = r6.m3895b()
            float r6 = (float) r6
            float r0 = r0 + r6
            a.e.a.j.e[] r6 = r2.f400A
            r6 = r6[r27]
            a.e.a.j.m r6 = r6.m3893d()
            a.e.a.j.m r7 = r9.f513f
            r6.m3763a(r7, r0)
            a.e.a.j.e[] r6 = r2.f400A
            r6 = r6[r19]
            a.e.a.j.m r6 = r6.m3893d()
            a.e.a.j.m r7 = r9.f513f
            float r0 = r0 + r5
            r6.m3763a(r7, r0)
            a.e.a.j.e[] r5 = r2.f400A
            r5 = r5[r27]
            a.e.a.j.m r5 = r5.m3893d()
            r5.m3764a(r13)
            a.e.a.j.e[] r5 = r2.f400A
            r5 = r5[r19]
            a.e.a.j.m r5 = r5.m3893d()
            r5.m3764a(r13)
            a.e.a.j.e[] r2 = r2.f400A
            r2 = r2[r19]
            int r2 = r2.m3895b()
            float r2 = (float) r2
            float r0 = r0 + r2
        L_0x02aa:
            r2 = r3
            goto L_0x0239
        L_0x02ac:
            r2 = r21
            if (r11 != 0) goto L_0x02b6
            if (r12 == 0) goto L_0x02b3
            goto L_0x02b6
        L_0x02b3:
            r0 = 1
            goto L_0x037f
        L_0x02b6:
            if (r11 == 0) goto L_0x02ba
        L_0x02b8:
            float r3 = r3 - r7
            goto L_0x02bd
        L_0x02ba:
            if (r12 == 0) goto L_0x02bd
            goto L_0x02b8
        L_0x02bd:
            int r6 = r15 + 1
            float r6 = (float) r6
            float r6 = r3 / r6
            if (r12 == 0) goto L_0x02cf
            r7 = 1
            if (r15 <= r7) goto L_0x02cb
            int r6 = r15 + -1
            float r6 = (float) r6
            goto L_0x02cd
        L_0x02cb:
            r6 = 1073741824(0x40000000, float:2.0)
        L_0x02cd:
            float r6 = r3 / r6
        L_0x02cf:
            int r3 = r2.m3822r()
            r7 = 8
            if (r3 == r7) goto L_0x02da
            float r3 = r0 + r6
            goto L_0x02db
        L_0x02da:
            r3 = r0
        L_0x02db:
            if (r12 == 0) goto L_0x02ea
            r7 = 1
            if (r15 <= r7) goto L_0x02ea
            a.e.a.j.e[] r3 = r5.f400A
            r3 = r3[r27]
            int r3 = r3.m3895b()
            float r3 = (float) r3
            float r3 = r3 + r0
        L_0x02ea:
            if (r11 == 0) goto L_0x02f8
            if (r5 == 0) goto L_0x02f8
            a.e.a.j.e[] r0 = r5.f400A
            r0 = r0[r27]
            int r0 = r0.m3895b()
            float r0 = (float) r0
            float r3 = r3 + r0
        L_0x02f8:
            if (r2 == 0) goto L_0x02b3
            a.e.a.f r0 = p000a.p014e.p015a.C0086e.f290q
            if (r0 == 0) goto L_0x0310
            long r7 = r0.f332z
            long r7 = r7 - r22
            r0.f332z = r7
            long r7 = r0.f324r
            long r7 = r7 + r22
            r0.f324r = r7
            long r7 = r0.f330x
            long r7 = r7 + r22
            r0.f330x = r7
        L_0x0310:
            a.e.a.j.f[] r0 = r2.f443i0
            r0 = r0[r1]
            if (r0 != 0) goto L_0x031c
            if (r2 != r4) goto L_0x0319
            goto L_0x031c
        L_0x0319:
            r7 = 8
            goto L_0x037c
        L_0x031c:
            if (r1 != 0) goto L_0x0323
            int r7 = r2.m3820s()
            goto L_0x0327
        L_0x0323:
            int r7 = r2.m3840i()
        L_0x0327:
            float r7 = (float) r7
            if (r2 == r5) goto L_0x0334
            a.e.a.j.e[] r8 = r2.f400A
            r8 = r8[r27]
            int r8 = r8.m3895b()
            float r8 = (float) r8
            float r3 = r3 + r8
        L_0x0334:
            a.e.a.j.e[] r8 = r2.f400A
            r8 = r8[r27]
            a.e.a.j.m r8 = r8.m3893d()
            a.e.a.j.m r10 = r9.f513f
            r8.m3763a(r10, r3)
            a.e.a.j.e[] r8 = r2.f400A
            r8 = r8[r19]
            a.e.a.j.m r8 = r8.m3893d()
            a.e.a.j.m r10 = r9.f513f
            float r11 = r3 + r7
            r8.m3763a(r10, r11)
            a.e.a.j.e[] r8 = r2.f400A
            r8 = r8[r27]
            a.e.a.j.m r8 = r8.m3893d()
            r8.m3764a(r13)
            a.e.a.j.e[] r8 = r2.f400A
            r8 = r8[r19]
            a.e.a.j.m r8 = r8.m3893d()
            r8.m3764a(r13)
            a.e.a.j.e[] r2 = r2.f400A
            r2 = r2[r19]
            int r2 = r2.m3895b()
            float r2 = (float) r2
            float r7 = r7 + r2
            float r3 = r3 + r7
            if (r0 == 0) goto L_0x0319
            int r2 = r0.m3822r()
            r7 = 8
            if (r2 == r7) goto L_0x037c
            float r3 = r3 + r6
        L_0x037c:
            r2 = r0
            goto L_0x02f8
        L_0x037f:
            return r0
        L_0x0380:
            r0 = 0
            return r0
        L_0x0382:
            r0 = 0
            return r0
    }
}
