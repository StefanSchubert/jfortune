/*
 * Copyright (c) 2017 by Oliver Boehm
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * (c)reated 22.12.2017 by oboehm (boehm@javatux.de)
 */
package jfortune;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * This is the main entry point of the application.
 *
 * @author oboehm
 * @since 0.5 (22.12.2017)
 */
public final class Main {

    private static Logger LOG = Logger.getLogger(Main.class);

    private Main() {
    }

    /**
     * Prints a cookie to stdout.
     *
     * @param args will be ignored.
     */
    public static void main(String[] args)  {
        LOG.setLevel(Level.OFF);
        FortuneProvider fortuneProvider = new FortuneProviderFactory().getFortuneProvider();
        System.out.println(fortuneProvider.getFortune());
    }

}
